
public class Point {
	int x, y; // 멤버변수, 접근제어자를 안쓰면 packaged

	Point() { // 매개변수 없는 생성자(리턴값X)
		x = 0; // default값이 0이라도 초기값을 주는게 좋음
		y = 0;
	}

	// getter, setter 자동생성: 우클릭 Source>Generate Getters and Setters
	// getter: 매개변수X, 리턴O		setter: 매개변수O, 리턴X
	public int getX() {
		return x;
	}

	// 접근제어자: public > protected > packaged > private (위로갈수록 범위가 큼)
	protected void setX(int x) { // Set은 package와 상속만 가능
		this.x = x;
	}

	public int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}

	public void setPoint(int a, int b) {
		x = a;
		y = b;
	}

	public String showPoint() {
		return "(" + x + "," + y + ")";
	}

	public static void main(String[] args) {
//		Point.x=0;  x는 클래스변수X, 인스턴스변수 -> 사용하려면 객체를 생성해야함 (객체를 사용해서 접근이 가능함, Point x = new Point();)
// 특별히 공통으로 사용할 변수는 클래스 변수로 사용, MyPoint/YourPoint는 객체가 분리돼 값이 다름, 개별로 값을 줄 때 사용
		Point MyPoint = new Point();
		MyPoint.setPoint(10, 20);
		System.out.println("The x of MyPoint is " + MyPoint.getX() + ".");
		System.out.println("The y of MyPoint is " + MyPoint.getY() + ".");
		System.out.println("MyPoint is " + MyPoint.showPoint() + ".");
		Point YourPoint = new Point();
		YourPoint.setPoint(-5, 15);
		System.out.println("The x of YourPoint is " + YourPoint.getX() + ".");
		System.out.println("The y of YourPoint is " + YourPoint.getY() + ".");
		System.out.println("YourPoint is " + YourPoint.showPoint() + ".");
	}

}
