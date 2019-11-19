
public class DataStructure2 {
	private final static int SIZE = 15;
	private int [] arrayOfInts = new int[SIZE];
	
	public DataStructure2() {
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
	protected class InnerEvenIterator {	//������Ű���� private���� ����, private�� ��ü�����Ұ�(new)
		private int next = 0;
		public boolean hasNext() {
			return (next <= SIZE-1);
		}
		public int getNext() {
			int retValue = arrayOfInts[next];
			next += 2;
			return retValue;
		}
	}
}
