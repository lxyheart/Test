/*
���ܼ���¼�����ݺ��·ݣ��������µ�������---��switch�ṹ��
*/
import java.util.Scanner;
class Test3 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("���������");
		int year = n.nextInt();
		System.out.println("�������·�");
		int month = n.nextInt();

		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"����31��");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+"����30��");
				break;
			case 2:
				if(year%4==0&&year%100!=0||year%400==0){
					System.out.println(month+"����29��");
				}else{
					System.out.println(month+"����28��");
				}
				break;
			default:
				if(month>12||month<1)
				System.out.println("����Ƿ��·�");
			break;
		}
	}
}
