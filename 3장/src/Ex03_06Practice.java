
public class Ex03_06Practice {
	public static void main(String[] args) {
		int[][] a = new int[9][9];
		for (int i = 1; i <= a.length; i++) { // i=단, j=곱하는값, 배열에 저장
			for (int j = 1; j <= 9; j++) { //j <= a[i].length로 쓸경우 a[9]이기때문에 에러남(a[8]까지 있음)
				a[i - 1][j - 1] = i * j;
			}
		}
		System.out.println("구구단");
		for (int i = 1; i <= 9; i++) { // 배열에서 결과 출력
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + a[i - 1][j - 1] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}

}
/*
 * for(int i=1; i<=9; i++) { //배열에서 결과 출력 for(int j=1; j<=0; j++_ {
 * System.out.print(j + "*" + i + "=" + a[i - 1][j - 1] + "\t"); }
 * System.out.println(); }
 */
