/*
���ܼ���¼���2��������2�������н�����
*/
import java.util.Scanner;
class Test1 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("�������һ����");
		int num1 = n.nextInt();
		System.out.println("������ڶ�����");
		int num2 = n.nextInt();
		System.out.println("����ǰ����Ϊ��"+"num1="+num1+",num2="+num2);
		int t;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println("���������Ϊ��"+"num1="+num1+",num2="+num2);

	}
}
