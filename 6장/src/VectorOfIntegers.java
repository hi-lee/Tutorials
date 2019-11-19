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
			System.out.println("try �������");
			out = new PrintWriter(new FileWriter("Vector.txt"));
			for (int i = 0; i < initSize; i++) {
				out.println(i + "��° ���Ұ��� " + vec.elementAt(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsExcepton ��� : " + e.getMessage());
		} catch (IOException e) {
			System.err.println("IOException ��� : " + e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if (out !=null ) {
				System.out.println("PrintWriter�� ����");
				out.close();
			} else {
				System.out.println("PrintWriter�� ���� ���� ����");
			}
		}
		
	}

	public static void main(String[] args) {
		VectorOfIntegers vc = new VectorOfIntegers();
		vc.printVector();
	}
}
