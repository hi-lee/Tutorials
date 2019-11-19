
public class EnhancedFor {
	public static void main(String[] args) {
		int rsum = 0, tsum = 0 ;
		int [][] num = {{2, 3, 13}, {4,5,14},{6,7,15},{8,9,16},{10,11,17}};
		for(int[] i : num) { 	//i에 행이 들어감
			for(int j : i) { 	//원래값보다 하나 적게 선언함, 일반변수
				rsum += j;
				System.out.print(j + "\t");
			}
			System.out.print("행의 합 : " + rsum);
			System.out.println();
			tsum += rsum;
			rsum = 0; 	//열을 0으로 초기화해서 다음행으로 넘어감
		}
		System.out.print("**배열의 합 ** : " + tsum);;
	}
}
