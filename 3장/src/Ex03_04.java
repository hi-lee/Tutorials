import java.io.*;

public class Ex03_04 {
	public static void main(String[] args) throws IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 10개를 입력하세요! : ");
		for (int x = 0; x < r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("입력 데이터 값 : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		for (int i = 0; i < r.length - 1; i++) {
			for (int j = 0; j < r.length; j++) {
				if (r[i] > r[j]) {
					int tm = r[i];
					r[i] = r[j];
					r[j] = tm;
				}
			}
		}
/* 버블정렬
 * int n=r.length; //배열의 크기
 * int i=1; //회전수
 * while(i<n) {
 * 	boolean flag=true; //플래그 설정
 * 	for(int j=0; j<n-i; j++){
 * 		if(r[j]>r[j+1]){
 * 			int tm = r[j];
 * 			r[j] = r[j+1];
 * 			r[j+1] = tm;
 * 			flag = false;
 */
		System.out.print("오름차순 데이터 값 : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("합 계 : ");
		int sum = 0;
		for (int x = 0; x < r.length; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.print("평균 : " + (sum / r.length));
	}
}
