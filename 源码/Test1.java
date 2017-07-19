/*
接受键盘录入的2个数，把2个数进行交换。
*/
import java.util.Scanner;
class Test1 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = n.nextInt();
		System.out.println("请输入第二个数");
		int num2 = n.nextInt();
		System.out.println("交换前的数为："+"num1="+num1+",num2="+num2);
		int t;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println("交换后的数为："+"num1="+num1+",num2="+num2);

	}
}
