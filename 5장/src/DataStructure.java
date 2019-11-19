
public class DataStructure {
	private final static int SIZE = 15; 		//SIZE: 클래스,상수 변수
	private int[] arrayOfInts = new int[SIZE];
	
	public DataStructure() {		//생성될때 0~14 할당
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
		private int next = 0; 		//->DataStructure만 사용가능(private)
		public boolean hasNext() {
			return (next <= SIZE-1);
		}
		public int getNext() {
			int retValue = arrayOfInts[next];		//내부클래스는 객체 생성안하고 바로 사용
			next += 2;		//짝수값만 나옴
			return retValue;
		}
	}
	public static void main(String s[]) {
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}
