/*
接受键盘录入的分数，打印出等级。---用switch结构。
	90-100  :优
	80--90：良。
	70--80 :中
	60 -70： 及格
	60分以下：不及格
*/
import java.util.Scanner;
class Test2 {
	public static void main(String[] args) {
			Scanner n = new Scanner(System.in);
			System.out.println("请输入分数（100分制）");
			int score = n.nextInt();
			if(score<0||score>100){
					System.out.println("输入成绩非法");
					return ;
				}
			switch(score/10){

				case 6:
					System.out.println("及格");
					break;
				case 7:
					System.out.println("中");
					break;
				case 8:
					System.out.println("良");
					break;
				case 9:
					System.out.println("优");
					break;
				default:
					System.out.println("不及格");
				break;
			}
		
	}
}
