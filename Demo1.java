import java.util.Scanner;
class Demo1 {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("请输入性别（男/女）");

		String s = n.next();
		System.out.println("是否双眼皮（是:true/否:false）");
		boolean flag = n.nextBoolean();
		boolean result = (s.equals("女"))&&flag;
		System.out.println(result);
	}
}
