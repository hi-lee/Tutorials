import java.awt.Point;
public class Circle extends Point{
	int radius;
	public static void main(String[] args) {
		Point pt1, pt2; Circle cl1, cl2; //Point: super class, Circle: sub class
		pt1 = new Point();
		pt2 = new Point();
		cl1 = new Circle();
		pt1 = cl1;
//		cl2 = pt2;
//		cl2 = (Circle) pt2;
		cl2 = (Circle) pt1;
	}
}
