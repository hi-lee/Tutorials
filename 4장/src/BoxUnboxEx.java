
public class BoxUnboxEx {
	public static void main(String[] args) {
		Integer boxint = new Integer(200);
		Integer autobint = 400;
		Double boxdouble = Double.valueOf(35.267);
		
		int number = boxint.intValue();
		int abnumber = boxint;
		
		double dnumber = boxdouble.doubleValue();
		
		System.out.println("��ڽ� ���� �� : "+number);
		System.out.println("�ڵ���ڽ������� : "+abnumber);
		System.out.println("��ڽ� �Ǽ� �� : "+dnumber);
		System.out.println("������ 2������ : "+Integer.toBinaryString(boxint));
		System.out.println("������ 16������ : "+Integer.toHexString(number));
		System.out.println("Not a Number : "+Double.isNaN(dnumber));
		
	}
}
