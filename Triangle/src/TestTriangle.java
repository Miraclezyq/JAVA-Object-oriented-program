import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ε������ߣ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Triangle T1 = new Triangle(a, b, c);
		T1.setName(a, b, c);
		
		//���Զ�������һ����
		System.out.println("�����ε�A�߳�Ϊ��"+T1.getA());
		System.out.println("�����ε������" + T1.getArea());
		System.out.println("�����ε��ܳ���" + T1.getPerimeter());
		T1.testShape();
		
		

	}

}
