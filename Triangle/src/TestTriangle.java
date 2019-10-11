import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三角形的三条边：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Triangle T1 = new Triangle(a, b, c);
		T1.setName(a, b, c);
		
		//尝试读出其中一条边
		System.out.println("三角形的A边长为："+T1.getA());
		System.out.println("三角形的面积：" + T1.getArea());
		System.out.println("三角形的周长：" + T1.getPerimeter());
		T1.testShape();
		
		

	}

}
