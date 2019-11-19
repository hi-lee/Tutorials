import java.util.Scanner;

public class FibonacciSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double j = 0, sum=0;

		System.out.print("수열의 합을 구할 범위를 입력하세요 : ");
		num = sc.nextInt();
		System.out.print("수열 : ");
		for (int i = 1; i <= num; i++) {
			System.out.print("1/"+i+"  "); 
			j = (1.0 / i);
			sum += j;			
		}			
		System.out.println("");
		System.out.println("합 : " + sum);
	}
}
/* for(int i=1; i<=n; i++) {
 * 	if(i==n) {
 * 	System.out.print("1/"+i);
 * } else
 * 	System.out.print("1/"+i+",");
 * 	sum+=1.0/i;
 * }
 * 	System.out.println();
 * 	System.out.println("합 : "+sum);
 * }
 */
