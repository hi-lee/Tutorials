package algorithm;

public class Mabang {

	int size;
	int[][] arr;

	public Mabang() { // �Ű����� ���� ������
		size = 5; // �⺻������ 5�� ����
		setArray(size);
	}

	public Mabang(int size) { // size�� �Է� ����
		this.size = size;
		setArray(size); // �迭 setting�Ѱ� ȣ��
	}

	private void setArray(int size) { // �迭ũ�⸦ �����ϴ� setArray, ����X
		arr = new int[size][size];
	}

	public void resolveMabang() {
		int i = 0; //�迭�� �� ��ġ
		int j = size / 2; //�迭�� �� ��ġ
		int N = 1; //�ԷµǴ� ��
		while(N <= size*size) {
			arr[i][j] = N;
			if (N % size == 0) { //�Է��� ���� �迭 ũ���� ������� Ȯ��
				i++;
			} else {
				i--;
				j++;				
				if (i < 0)	 //���� �迭 �ε����� 0���� �۾���
					i = size-1;  //�ε��� ��ȣ�� ���� ū �ε����� �Ҵ�
				if (j > size-1) 	//���� �迭 �ε����� (�迭.length-1)���� Ŀ��
					j = 0; 	//�ε��� ��ȣ�� ���� ���� �ε��� �Ҵ�
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
