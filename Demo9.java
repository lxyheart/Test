/*
if���֧,while
*/
import java.util.Scanner;
class Demo9 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("���������:");
		int score = n.nextInt();
		while(true){
			if(score>100||score<0){
				System.out.println("��������Ƿ�����������");
				score = n.nextInt();
			}else{
				if(score>=90){
					System.out.println("����");
				}else if(score>=80){
					System.out.println("��");
				}else if(score>=70){
					System.out.println("��");
				}else if(score>=60){
					System.out.println("����");
				}else{
					System.out.println("������");
					}
					break;
				}
			}
	
		
	}
}
