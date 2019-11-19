import java.io.*;
import java.util.Vector;

public class VectorOfIntegers {
	private Vector vec;
	private static final int initSize = 20;

	public VectorOfIntegers() {
		vec = new Vector(initSize);
		for (int i = 0; i < initSize; i++) {
			vec.addElement(new Integer(i));
		}
	}

	public void printVector() {
		PrintWriter out = null;
		try {
			System.out.println("try 블록진입");
			out = new PrintWriter(new FileWriter("Vector.txt"));
			for (int i = 0; i < initSize; i++) {
				out.println(i + "번째 원소값은 " + vec.elementAt(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsExcepton 잡기 : " + e.getMessage());
		} catch (IOException e) {
			System.err.println("IOException 잡기 : " + e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if (out !=null ) {
				System.out.println("PrintWriter를 닫음");
				out.close();
			} else {
				System.out.println("PrintWriter가 열려 있지 않음");
			}
		}
		
	}

	public static void main(String[] args) {
		VectorOfIntegers vc = new VectorOfIntegers();
		vc.printVector();
	}
}
