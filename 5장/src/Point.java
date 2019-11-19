
public class Point {
	int x, y; // �������, ���������ڸ� �Ⱦ��� packaged

	Point() { // �Ű����� ���� ������(���ϰ�X)
		x = 0; // default���� 0�̶� �ʱⰪ�� �ִ°� ����
		y = 0;
	}

	// getter, setter �ڵ�����: ��Ŭ�� Source>Generate Getters and Setters
	// getter: �Ű�����X, ����O		setter: �Ű�����O, ����X
	public int getX() {
		return x;
	}

	// ����������: public > protected > packaged > private (���ΰ����� ������ ŭ)
	protected void setX(int x) { // Set�� package�� ��Ӹ� ����
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
//		Point.x=0;  x�� Ŭ��������X, �ν��Ͻ����� -> ����Ϸ��� ��ü�� �����ؾ��� (��ü�� ����ؼ� ������ ������, Point x = new Point();)
// Ư���� �������� ����� ������ Ŭ���� ������ ���, MyPoint/YourPoint�� ��ü�� �и��� ���� �ٸ�, ������ ���� �� �� ���
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
