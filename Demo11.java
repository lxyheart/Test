/*
switch(����ʽ)�ṹ
*/
import java.util.Scanner;
class Demo11 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("���������100���ƣ�");
		int score = n.nextInt();
		while(true){
			if(score>100||score<0){
				 System.out.println("�Ƿ�����,�������루100���ƣ�");
			     score = n.nextInt();
			}else{
				switch(score/10){
				default :
					System.out.println("������");
					break;
				case 6:
					System.out.println("D");
					break;
				case 7:
					System.out.println("C");
					break;
				case 8:
					System.out.println("B");
					break;
				case 9:
					System.out.println("A");
					break;
				}
				break;
			}
			
		}
		
	}
}