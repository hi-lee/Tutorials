
public class Cylinder extends Circle {
	int height;

	double volume() {
		return area() * height;
	}

	Cylinder() {
		height = 10;
	}

//	int setHeight() {
//		return height = 10 ;
//	}
	String showCylinder() {
		return showCircle() + ", Height = " + height;
	}

	public static void main(String[] args) {
		Cylinder MCylinder = new Cylinder();
//		Cylinder.height = 5;	
//		MCylinder.setHeight();
		System.out.println("실린더의 부피 : " + MCylinder.volume());
		System.out.println(MCylinder.showCylinder());
	}
}
