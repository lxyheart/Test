import java.util.Scanner;

class Demo5 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("�������һ����");
		int num1 = n.nextInt();
		System.out.println("������ڶ�����");
		int num2 = n.nextInt();
		System.out.println("�������������");
		int num3 = n.nextInt();
		int max = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("���ֵΪ:"+max);
		String str = n.next();
		char ch = str.charAt(0);
		System.out.println((ch>='A'&&ch<='Z')?"��д��ĸ":"Сд��ĸ");
	}
}
