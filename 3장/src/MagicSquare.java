import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size, i, j;

		System.out.print("마방진을 구할 배열의 크기를 입력하세요 : ");
		size = sc.nextInt();
		int a[][] = new int[size][size];		
		
		i = 0; //배열의 행 위치
		j = (size / 2); //배열의 열 위치
		for (int n = 1; n <= (size*size); n++) {
			a[i][j] = n;
			if (n % size == 0) {
				i++;
			} else {
				i--;
				j++;				
				if (i < 0)	 i = size-1;  //else문 안에 if문 2개가 들어감
				if (j > size-1) 	j = 0; 
			}			
		}
			for (i = 0; i <= 4; i++) {
				for (j = 0; j <= 4; j++) {
					System.out.print(a[i][j]+"\t");
				}
				System.out.println();
			}		
	}
}
/* while(n <= size*size) {
 * 	a[i][j] = n;
 * 	if(n % size==0) {  //입력한 값이 배열 크기의 배수인지 확인
 * 		i = i+1;
 * }else{
 * 		i=i-1;
 * 		j=j+1;
 * 	if(i<0) //행의 배열 인덱스가 0보다 작아짐
 * 	i = size-1; //인덱스 번호로 젤 큰 인덱스를 할당
 * if(j==size) //열의 배열 인덱스가(배열.length-1)보다 커짐
 * 	j=-;  //인덱스 번호로 젤 작은 인덱스 할당
 */
