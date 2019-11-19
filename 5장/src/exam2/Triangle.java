package exam2;
import java.util.*;

public class Triangle implements ShapeDraw{
	public void drawing(int i) {
		for(int j = 1; j<=i; j++) {
			for(int k=1; k<=i; k++) {
				
				if(k==1 || k==j || j==i) System.out.print("*");
				else System.out.print(" ");				
			}
			System.out.println();
		}
	}
}
