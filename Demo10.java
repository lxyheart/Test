/*
判断年天数，月天数
*/
import java.util.Scanner;
class Demo10 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = n.nextInt();
		System.out.println("请输入月份:");
		int month = n.nextInt();
		/*if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			
			System.out.println(month+"月有31天");
		}else if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(month+"月有29天");
			}else{
				System.out.println(month+"月有28天");
			}

		}else{
			System.out.println(month+"月有30天");
		}*/
		while(true){
			if(month<1||month>12){
				System.out.println("输入月份非法,请重新输入");
				month = n.nextInt();
			}else{
                if(year%4==0&&year%100!=0||year%400==0){
					System.out.println(year+"年有366天");
				if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
					System.out.println(month+"月有31天");
					
				}else if(month==2){
					System.out.println(month+"月有29天");
				}else{
					System.out.println(month+"月有30天");
				}
				break;
			}else{
				System.out.println(year+"年有355天");
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
				System.out.println(month+"月有31天");
			}else if(month==2){
				System.out.println(month+"月有28天");
			}else{
				System.out.println(month+"月有30天");
			}
			break;
		} 
			}
			
		}
        
	}
}
