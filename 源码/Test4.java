/*
1:дһ������ʵ�ֲ����������������һ��[0,100]�������û�ȥ�£�����û�����5��֮�ڲ��У�
��������������������ˡ�

*/
import java.util.Random;
import java.util.Scanner;
class Test4 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("������һ��0-100֮�������");
		int num = n.nextInt();
		Random r = new Random();
		int s =r.nextInt(101);	
		//System.out.println(s);
		int i=0;
	   while(true){
		if(num==s){	
			System.out.println("��ϲ��¶��ˣ�");
			break;
		}else{
			if(num>s){
				System.out.println("���ź���µ������ˣ��������");
			     num = n.nextInt();
			}else{
				System.out.println("���ź���µ���С�ˣ��������");
				 num = n.nextInt();
			}
				i++;
				if(i==4){
					System.out.println("����㶼û�¶ԣ������!");
					System.out.println("�����������Ϊ:"+s);
					break;
				}			
			}
		}
	}
}
