
public class ArrayProg {
	public static void main(String[] args) {
		int[] x;
		int sum=0;
		x = new int[5]; //5�� ����->5���� ��밡��
		
		for(int i=0; i<5; i++) {
			x[i] = i * 10;
		}
		for(int j=0; j<5; j++) {
			sum += x[j];
		}
		System.out.println("�迭 5���� �� : " +sum);
		
	}
}
