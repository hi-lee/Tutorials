package exam2;

import java.util.Scanner;

public class Rect implements ShapeDraw {
	public void drawing(int i) {
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= i; k++) {

				if (j == 1 || j == i || k == 1 || k == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
