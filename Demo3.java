import java.util.Scanner;
class  Demo3{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = n.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
		//���ӷ�
		System.out.println('a'+1+"212");
		System.out.println(a+"212"+'a');
	}
}
