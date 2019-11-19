
public class Circle extends Point { //super class:Point�� ���� x,y�� �޾Ƽ� ���(Point���� private x,y�����ϸ� ���X)
	int radius;

	Circle() {	//������, ����Ŭ�������� ��ӹ��� �������(�������:�����̸��� �Ķ���)
		x = 5;
		y = 5;
		radius = 5;
	}

	Circle(int a, int b, int c) {
		x = a;
		y = b;
		radius = c;
	}

	public int getRadius() { 	//get, set���� ù����:�빮��
		return radius;
	}

	private void setRadius(int r) {
		radius = r;	//���� Ŭ���� �� �޼ҵ� �ȿ��� �޼ҵ� ȣ���Ҷ� ��ü����X
	}

	public String showCircle() {
		return "Center = " + "(" + x + "," + y + ")" + ", Radius = " + radius;
	}
	double area() {
		return radius*radius*Math.PI; 
	}
	double area(int a) {
		double b = 0;
		b = a*a*Math.PI;
		return b;
	}

	public static void main(String args[]) {
		Circle MyCircle = new Circle();
		MyCircle.setPoint(10, 20); //��ü.�޼ҵ�
		MyCircle.setRadius(30);
		System.out.println("The x of MyCircle is " + MyCircle.getX() + ".");
		System.out.println("The y of MyCircle is " + MyCircle.getY() + ".");
		System.out.println("The radius of MyCircle is " + MyCircle.getRadius() + ".");
		System.out.println("MyCircle : " + MyCircle.showCircle() + ".");
		System.out.println("MyCircle area : " + MyCircle.area() );

		System.out.println("MyCircle area : " + MyCircle.area(10));
	}
	



}
