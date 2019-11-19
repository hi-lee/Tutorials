package algorithm;

public class Mabang {

	int size;
	int[][] arr;

	public Mabang() { // 매개변수 없는 생성자
		size = 5; // 기본사이즈 5로 지정
		setArray(size);
	}

	public Mabang(int size) { // size를 입력 받음
		this.size = size;
		setArray(size); // 배열 setting한것 호출
	}

	private void setArray(int size) { // 배열크기를 설정하는 setArray, 리턴X
		arr = new int[size][size];
	}

	public void resolveMabang() {
		int i = 0; //배열의 행 위치
		int j = size / 2; //배열의 열 위치
		int N = 1; //입력되는 값
		while(N <= size*size) {
			arr[i][j] = N;
			if (N % size == 0) { //입력한 값이 배열 크기의 배수인지 확인
				i++;
			} else {
				i--;
				j++;				
				if (i < 0)	 //행의 배열 인덱스가 0보다 작아짐
					i = size-1;  //인덱스 번호로 가장 큰 인덱스를 할당
				if (j > size-1) 	//열의 배열 인덱스가 (배열.length-1)보다 커짐
					j = 0; 	//인덱스 번호로 가장 작은 인덱스 할당
			}
			N++;
		}
		displayMabang();
	}

	public void displayMabang() {
		for (int n = 0; n<arr.length; n++) {
			for (int m = 0; m <arr.length; m++) {
				System.out.print(arr[n][m] + "\t");
			}
			System.out.println();
		}

	}

}
