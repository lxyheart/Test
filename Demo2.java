/*����С����Ҫһ���绰�ֱ��ҵ����������ĳɼ�Ϊ98�����ϣ���ѧ�ɼ�
Ҳ����Ϊ98�����ϣ������붼����Ҫ���ó���������������
*/
import java.util.Scanner;
class Demo2 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("��ѧ�ɼ�:");
		int mathScore = n.nextInt();
		boolean flag = true;
		boolean flag1 = true;
		while(flag){
			if(mathScore<0||mathScore>100){
			System.out.println("�ɼ�������Χ,����");
				mathScore = n.nextInt();
				if(mathScore>=0&&mathScore<=100) {
					break;
				}
			}else{
					break;
				}	
				
			}
		
		System.out.println("���ĳɼ�:");
		int chinaScore = n.nextInt();
		while(flag1){
			if(chinaScore<0||chinaScore>100){
			System.out.println("�ɼ�������Χ,����");
			chinaScore = n.nextInt();
			if(chinaScore>=0&&chinaScore<=100) {
					break;
				}
			}else{
					break;
				}
			}
		if(mathScore>98&chinaScore>98) {
			System.out.println("�õ��ֱ�һ��");
		} else {
			System.out.println("û���ֱ�");
		}
			
	}
}
