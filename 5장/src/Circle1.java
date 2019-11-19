
public class Circle1 extends Point {
	static int noCircle = 0;	//클래스변수
	protected int radius;		//인스턴스변수
	Circle1(int a, int b, int r){	//지역변수
		x = a;	//x:인스턴스, a:지역
		y = b;	//y:인스턴ㅅ, b:지역
		radius = r;	//radius:인스턴스, r:지역
		noCircle++;	//클래스
	}
	public String showCircle() {
		return "Center = " + "(" + x + "," + y + ")" + ", Radius = " + radius;  //인스턴스
	}
	public static void main(String args[]) {
		Circle1 MyCircle = new Circle1(30,40,20);	//MyCircle:지역변수(메인메소드안에서 동작)
		System.out.println("MyCircle : " + MyCircle.showCircle() + ".");
		System.out.println("The number of circles is " + noCircle + "."); //noCircle:클래스
	}

}
