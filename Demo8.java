/*
if else�ṹ
*/

import java.util.Scanner;
class Demo8 {
	public static void main(String[] args) {
		Scanner n = new	Scanner(System.in);

		System.out.println("������һ�����");
		int year = n.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println("����");
		}else{
			System.out.println("��������");
		}

		System.out.println("������һ���ַ�");
		String s = n.next();
		char ch = s.charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
			System.out.println("���ַ�Ϊ��ĸ");
		}else{
			System.out.println("����");
		}
		
	}
}
