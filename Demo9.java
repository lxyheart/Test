/*
if多分支,while
*/
import java.util.Scanner;
class Demo9 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入分数:");
		int score = n.nextInt();
		while(true){
			if(score>100||score<0){
				System.out.println("输入分数非法，重新输入");
				score = n.nextInt();
			}else{
				if(score>=90){
					System.out.println("优秀");
				}else if(score>=80){
					System.out.println("良");
				}else if(score>=70){
					System.out.println("中");
				}else if(score>=60){
					System.out.println("及格");
				}else{
					System.out.println("不及格");
					}
					break;
				}
			}
	
		
	}
}
