import java.util.Scanner;
class Demo4 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("���������");
		int score = n.nextInt();
		String s = score>0&&score<60?
				   "������":((score>=60&&score<70)?
				   "����":((score>70&&score<80)?"��":"����"));
		System.out.println(s);

//		System.out.println("��ķ���Ϊ:"+score+(score>=60?"����":"������"));
//		System.out.println("���������:");
//		int year = n.nextInt();
//		System.out.println((year%4==0&&year%100!=0||year%400==0)?
//			"������":"��������");
	}
}
