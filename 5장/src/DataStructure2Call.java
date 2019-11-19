
public class DataStructure2Call {
	public static void main(String[] args) {
		DataStructure2 out = new DataStructure2();
		DataStructure2.InnerEvenIterator inn = out.new InnerEvenIterator();
		out.printEven();
	}
}
