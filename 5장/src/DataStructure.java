
public class DataStructure {
	private final static int SIZE = 15; 		//SIZE: Ŭ����,��� ����
	private int[] arrayOfInts = new int[SIZE];
	
	public DataStructure() {		//�����ɶ� 0~14 �Ҵ�
		for (int i=0; i<SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}
	public void printEven() {
		InnerEvenIterator iterator = this.new InnerEvenIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.getNext() + "  ");
		}
	}
	private class InnerEvenIterator {
		private int next = 0; 		//->DataStructure�� ��밡��(private)
		public boolean hasNext() {
			return (next <= SIZE-1);
		}
		public int getNext() {
			int retValue = arrayOfInts[next];		//����Ŭ������ ��ü �������ϰ� �ٷ� ���
			next += 2;		//¦������ ����
			return retValue;
		}
	}
	public static void main(String s[]) {
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}
