
public class ArrayProg {
	public static void main(String[] args) {
		int[] x;
		int sum=0;
		x = new int[5]; //5개 지정->5개만 사용가능
		
		for(int i=0; i<5; i++) {
			x[i] = i * 10;
		}
		for(int j=0; j<5; j++) {
			sum += x[j];
		}
		System.out.println("배열 5개의 합 : " +sum);
		
	}
}
