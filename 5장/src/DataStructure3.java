
public class DataStructure3 {
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure3() {
		for (int i = 0; i < SIZE; i++) {
		}
	}

	protected class InnerEvenIterator { 
		private int next = 0;

		public boolean hasNext() {
			return (next <= SIZE - 1);
		}

		public int getNext() {
			int retValue = arrayOfInts[next];
			next += 2;
			return retValue;
		}

		public void printEven() {
			InnerEvenIterator iterator = new InnerEvenIterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.getNext() + "  ");
			}
		}
	}
}