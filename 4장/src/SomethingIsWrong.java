import java.awt.Rectangle;

public class SomethingIsWrong extends Rectangle {
	
	public static void main (String[] args) {
		Rectangle myRect;
//		myRect = new Rectangle();
//		SomethingIsWrong myRect();
		myRect = new SomethingIsWrong();
		myRect.width = 40;
		myRect.height = 50;		
		System.out.println("myRect's area is " +((SomethingIsWrong)myRect).area()); 
		//myRect�� SIW���� �ٿ�ĳ����, �ٿ�ĳ���� �� area��� :(SomethingIsWrong)myRect)
	}
	int area() {
		return width*height;
	}
}
