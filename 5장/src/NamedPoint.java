import java.awt.Point;
class NamedPoint extends Point {
	String name;
	NamedPoint(int x, int y, String name){
		super(x, y);	//Point�� �ִ� x,y�� �����
		this.name = name;		
	}
	public static void main(String arg[]) {
		NamedPoint np = new NamedPoint(5, 6, "SmallPoint");
		System.out.println("X is " + np.x);
		System.out.println("Y is " + np.y);
		System.out.println("Name is " + np.name);
	}
}
