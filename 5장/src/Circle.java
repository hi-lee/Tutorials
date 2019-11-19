
public class Circle extends Point { //super class:Point의 변수 x,y를 받아서 사용(Point에서 private x,y설정하면 사용X)
	int radius;

	Circle() {	//생성자, 슈퍼클래스에서 상속받은 멤버변수(멤버변수:변수이름이 파란색)
		x = 5;
		y = 5;
		radius = 5;
	}

	Circle(int a, int b, int c) {
		x = a;
		y = b;
		radius = c;
	}

	public int getRadius() { 	//get, set뒤의 첫글자:대문자
		return radius;
	}

	private void setRadius(int r) {
		radius = r;	//같은 클래스 내 메소드 안에서 메소드 호출할때 객체생성X
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
		MyCircle.setPoint(10, 20); //객체.메소드
		MyCircle.setRadius(30);
		System.out.println("The x of MyCircle is " + MyCircle.getX() + ".");
		System.out.println("The y of MyCircle is " + MyCircle.getY() + ".");
		System.out.println("The radius of MyCircle is " + MyCircle.getRadius() + ".");
		System.out.println("MyCircle : " + MyCircle.showCircle() + ".");
		System.out.println("MyCircle area : " + MyCircle.area() );

		System.out.println("MyCircle area : " + MyCircle.area(10));
	}
	



}
