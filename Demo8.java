/*
if else结构
*/

import java.util.Scanner;
class Demo8 {
	public static void main(String[] args) {
		Scanner n = new	Scanner(System.in);

		System.out.println("请输入一个年份");
		int year = n.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println("闰年");
		}else{
			System.out.println("不是闰年");
		}

		System.out.println("请输入一个字符");
		String s = n.next();
		char ch = s.charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
			System.out.println("该字符为字母");
		}else{
			System.out.println("不是");
		}
		
	}
}
