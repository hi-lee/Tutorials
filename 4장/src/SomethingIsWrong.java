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
		//myRect를 SIW으로 다운캐스팅, 다운캐스팅 후 area사용 :(SomethingIsWrong)myRect)
	}
	int area() {
		return width*height;
	}
}
