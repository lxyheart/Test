/*
���ܼ���¼��ķ�������ӡ���ȼ���---��switch�ṹ��
	90-100  :��
	80--90������
	70--80 :��
	60 -70�� ����
	60�����£�������
*/
import java.util.Scanner;
class Test2 {
	public static void main(String[] args) {
			Scanner n = new Scanner(System.in);
			System.out.println("�����������100���ƣ�");
			int score = n.nextInt();
			if(score<0||score>100){
					System.out.println("����ɼ��Ƿ�");
					return ;
				}
			switch(score/10){

				case 6:
					System.out.println("����");
					break;
				case 7:
					System.out.println("��");
					break;
				case 8:
					System.out.println("��");
					break;
				case 9:
					System.out.println("��");
					break;
				default:
					System.out.println("������");
				break;
			}
		
	}
}
