import java.util.Scanner;

class Demo5 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int num1 = n.nextInt();
		System.out.println("请输入第二个数");
		int num2 = n.nextInt();
		System.out.println("请输入第三个数");
		int num3 = n.nextInt();
		int max = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("最大值为:"+max);
		String str = n.next();
		char ch = str.charAt(0);
		System.out.println((ch>='A'&&ch<='Z')?"大写字母":"小写字母");
	}
}
