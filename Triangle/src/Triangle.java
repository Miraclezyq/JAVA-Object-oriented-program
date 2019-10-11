
public class Triangle {
	private int a,b,c;
	private int flag = 0;
	
	//两个构造函数
	Triangle(){}
	Triangle(int a,int b,int c){
		if((a+b)>c && (c+b) > a && (a+c) > b) {
			this.a = a;
			this.b = b;
			this.c = c;
			flag = 1;
		}
		else
		{
			System.out.println("这三条边无法组成一个三角形，请重试！");
			flag = 0;
		}
	}
	
	public void setName(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//一组set&get，但是这里没有派上用场
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
		return b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getC() {
		return c;
	}
	
	public double getArea() {
		if(flag == 1) {
			double p = (a + b + c)/2;
			return Math.sqrt(p * (p-a) * (p-b) * (p-c));
		}
		else {
			System.out.println("这三条边无法组成一个三角形!");
			return -1;
		}
	}
	
	public double getPerimeter() {
		if(flag == 1) {
			return a + b + c;
		}
		else {
			return -1;
		}
	}
	
	public void testShape() {
		if(flag == 1) {
			if((a == b) && (b == c)){
				System.out.println("这是一个等边三角形！");
			}
			else
			{
				if((a == b ||  b == c || c == a)) {
					System.out.println("这是一个等腰三角形！");
				}
				else
				{
					System.out.println("这是一个普通三角形！");
				}
			}
		}
		else
		{
			System.out.println("该三角形不存在！");
		}
	}
	
}
