import java.awt.Point;
public class MyRect {
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	MyRect buildRect(int a, int b, int c, int d) {
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
		System.out.println("1번째 메소드");
		System.out.println("사각형면적 : " + (x2-x1)*(y2-y1));
		return this;
	}
	MyRect buildRect (Point topLeft, Point bottomRight) {
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = bottomRight.x;
		y2 = bottomRight.y;
		System.out.println("2번째 메소드");
		System.out.println("사각형면적 : " + (x2-x1)*(y2-y1));
		return this;
	}
	MyRect buildRect(Point topLeft, int w, int h) {
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = (x1+w);
		y2 = (y1+h);
		System.out.println("3번째 메소드");
		System.out.println("사각형면적: " + (x2-x1)*(y2-y1));
		return this;
	}
	public static void main(String args[]) {
		MyRect rect = new MyRect();
		rect.buildRect(25, 25,50,50);
		rect.buildRect(new Point(10,10), new Point(20,20));
		rect.buildRect(new Point (10,10), 50,50);
	}

}
