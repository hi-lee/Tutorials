
public class BoxUnboxEx {
	public static void main(String[] args) {
		Integer boxint = new Integer(200);
		Integer autobint = 400;
		Double boxdouble = Double.valueOf(35.267);
		
		int number = boxint.intValue();
		int abnumber = boxint;
		
		double dnumber = boxdouble.doubleValue();
		
		System.out.println("언박싱 정수 값 : "+number);
		System.out.println("자동언박싱정수값 : "+abnumber);
		System.out.println("언박싱 실수 값 : "+dnumber);
		System.out.println("정수를 2진수로 : "+Integer.toBinaryString(boxint));
		System.out.println("정수를 16진수로 : "+Integer.toHexString(number));
		System.out.println("Not a Number : "+Double.isNaN(dnumber));
		
	}
}
