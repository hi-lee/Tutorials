
public class Array2Prog {
	public static void main(String[] args) {
		int[][] arycount = { { 10, 20, 30 }, { 40, 50, 60 } }; //2��3���� �ʱ�ȭ
		int[][] subject = new int[2][3]; 
		int asum = 0;
		int bsum = 0;

		for (int x = 0; x < subject.length; x++) { //��ǥ��
			for (int y = 0; y < subject[x].length; y++) { //��ǥ��
				subject[x][y] = x + y;
			}
		}
		for (int x = 0; x < arycount.length; x++) {
			for (int y = 0; y < arycount[x].length; y++) {
				asum = asum + arycount[x][y];
				bsum = bsum + subject[x][y]; //subject�� arycount���� ������ �ȵ�, �����ϰų� Ŀ����

			}
		}
		System.out.println("2���� ��� arycount�� ��� : " + arycount.length);
		System.out.println("2���� ��� arycount�� ���� : " + arycount[0].length);
		System.out.println("2���� ��� arycount�� �� : " + asum);
		System.out.println("2���� ��� subject�� �� : " + bsum);
	}
}