package exam2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ShapeDraw sd;
		int i;
		
		System.out.println("������ ũ�⸦ �Է��ϼ��� : ");
		i = sc.nextInt();
		
		sd = new Triangle();
		System.out.println("�ﰢ��");
		sd.drawing(i);
		
		System.out.println();
		
		sd = new Rect();
		System.out.println("�簢��");
		sd.drawing(i);
	}

	
	
}
