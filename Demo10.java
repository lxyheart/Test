/*
�ж���������������
*/
import java.util.Scanner;
class Demo10 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("���������:");
		int year = n.nextInt();
		System.out.println("�������·�:");
		int month = n.nextInt();
		/*if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			
			System.out.println(month+"����31��");
		}else if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(month+"����29��");
			}else{
				System.out.println(month+"����28��");
			}

		}else{
			System.out.println(month+"����30��");
		}*/
		while(true){
			if(month<1||month>12){
				System.out.println("�����·ݷǷ�,����������");
				month = n.nextInt();
			}else{
                if(year%4==0&&year%100!=0||year%400==0){
					System.out.println(year+"����366��");
				if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
					System.out.println(month+"����31��");
					
				}else if(month==2){
					System.out.println(month+"����29��");
				}else{
					System.out.println(month+"����30��");
				}
				break;
			}else{
				System.out.println(year+"����355��");
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
				System.out.println(month+"����31��");
			}else if(month==2){
				System.out.println(month+"����28��");
			}else{
				System.out.println(month+"����30��");
			}
			break;
		} 
			}
			
		}
        
	}
}
