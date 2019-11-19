
public class Array2Prog {
	public static void main(String[] args) {
		int[][] arycount = { { 10, 20, 30 }, { 40, 50, 60 } }; //2행3열로 초기화
		int[][] subject = new int[2][3]; 
		int asum = 0;
		int bsum = 0;

		for (int x = 0; x < subject.length; x++) { //행표기
			for (int y = 0; y < subject[x].length; y++) { //열표기
				subject[x][y] = x + y;
			}
		}
		for (int x = 0; x < arycount.length; x++) {
			for (int y = 0; y < arycount[x].length; y++) {
				asum = asum + arycount[x][y];
				bsum = bsum + subject[x][y]; //subject가 arycount보다 작으면 안됨, 동일하거나 커야함

			}
		}
		System.out.println("2차원 배월 arycount의 행수 : " + arycount.length);
		System.out.println("2차원 배월 arycount의 열수 : " + arycount[0].length);
		System.out.println("2차원 배월 arycount의 합 : " + asum);
		System.out.println("2차원 배월 subject의 합 : " + bsum);
	}
}