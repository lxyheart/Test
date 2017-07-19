/*
接受键盘录入的年份和月份，输出这个月的天数。---用switch结构。
*/
import java.util.Scanner;
class Test3 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = n.nextInt();
		System.out.println("请输入月份");
		int month = n.nextInt();

		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"月有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"月有30天");
				break;
			case 2:
				if(year%4==0&&year%100!=0||year%400==0){
					System.out.println(month+"月有29天");
				}else{
					System.out.println(month+"月有28天");
				}
				break;
			default:
				if(month>12||month<1)
				System.out.println("输入非法月份");
			break;
		}
	}
}
