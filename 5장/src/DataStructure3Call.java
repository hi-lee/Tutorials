
public class DataStructure3Call {
	public static void main(String[] args) {
		DataStructure3 out = new DataStructure3();
		DataStructure3.InnerEvenIterator inn = out.new InnerEvenIterator();
		inn.printEven();
	}
}
