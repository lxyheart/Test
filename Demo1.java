import java.util.Scanner;
class Demo1 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("�������Ա���/Ů��");

		String s = n.next();
		System.out.println("�Ƿ�˫��Ƥ����:true/��:false��");
		boolean flag = n.nextBoolean();
		boolean result = (s.equals("Ů"))&&flag;
		System.out.println(result);
	}
}
