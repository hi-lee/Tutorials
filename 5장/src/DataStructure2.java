
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
	protected class InnerEvenIterator {	//같은패키지면 private제외 가능, private면 객체생성불가(new)
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
