import java.util.Scanner;
class Demo4 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入分数");
		int score = n.nextInt();
		String s = score>0&&score<60?
				   "不及格":((score>=60&&score<70)?
				   "及格":((score>70&&score<80)?"良":"优秀"));
		System.out.println(s);

//		System.out.println("你的分数为:"+score+(score>=60?"及格":"不及格"));
//		System.out.println("请输入年份:");
//		int year = n.nextInt();
//		System.out.println((year%4==0&&year%100!=0||year%400==0)?
//			"是闰年":"不是闰年");
	}
}
