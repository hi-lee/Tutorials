
public class EnhancedFor {
	public static void main(String[] args) {
		int rsum = 0, tsum = 0 ;
		int [][] num = {{2, 3, 13}, {4,5,14},{6,7,15},{8,9,16},{10,11,17}};
		for(int[] i : num) { 	//i�� ���� ��
			for(int j : i) { 	//���������� �ϳ� ���� ������, �Ϲݺ���
				rsum += j;
				System.out.print(j + "\t");
			}
			System.out.print("���� �� : " + rsum);
			System.out.println();
			tsum += rsum;
			rsum = 0; 	//���� 0���� �ʱ�ȭ�ؼ� ���������� �Ѿ
		}
		System.out.print("**�迭�� �� ** : " + tsum);;
	}
}
