package exam2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ShapeDraw sd;
		int i;
		
		System.out.println("도형의 크기를 입력하세요 : ");
		i = sc.nextInt();
		
		sd = new Triangle();
		System.out.println("삼각형");
		sd.drawing(i);
		
		System.out.println();
		
		sd = new Rect();
		System.out.println("사각형");
		sd.drawing(i);
	}

	
	
}
