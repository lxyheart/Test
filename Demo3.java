import java.util.Scanner;
class  Demo3{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = n.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
		//连接符
		System.out.println('a'+1+"212");
		System.out.println(a+"212"+'a');
	}
}
