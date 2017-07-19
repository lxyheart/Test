/*
if else结构
*/
import java.util.Scanner;

class Demo7 {
	public static void main(String[] args) {
			Scanner n = new	Scanner(System.in);
			System.out.println("请输入一个boolean类型值");
			boolean b = n.nextBoolean();			
			if(b){
				System.out.println("你输入了true");
			}else{
				System.out.println("你输入了false");
			}
	}
}
