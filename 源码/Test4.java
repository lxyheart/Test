/*
1:写一个程序，实现猜数，电脑随机产生一个[0,100]的数，用户去猜，如果用户能在5次之内猜中，
则输出你真棒。否则你真菜。

*/
import java.util.Random;
import java.util.Scanner;
class Test4 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入一个0-100之间的整数");
		int num = n.nextInt();
		Random r = new Random();
		int s =r.nextInt(101);	
		//System.out.println(s);
		int i=0;
	   while(true){
		if(num==s){	
			System.out.println("恭喜你猜对了！");
			break;
		}else{
			if(num>s){
				System.out.println("很遗憾你猜的数大了，请继续猜");
			     num = n.nextInt();
			}else{
				System.out.println("很遗憾你猜的数小了，请继续猜");
				 num = n.nextInt();
			}
				i++;
				if(i==4){
					System.out.println("五次你都没猜对，你真菜!");
					System.out.println("产生的随机数为:"+s);
					break;
				}			
			}
		}
	}
}
