
public class ArrayException {
	public static void main(String args[]) {
		String str1, str2;
		int sum, intval1, intval2;
		try {
			str1 = args[0];
			str2 = args[1];
			intval1 = Integer.parseInt(str1);
			intval2 = Integer.parseInt(str2);
			sum = intval1 + intval2;
			System.out.println("두 수의 합 = " + sum);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("배열 인덱스의수가 부족하거나 숫자로 변환할 수 없는 예외 발생");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생");
		}
	}
}
// Run Configuration>Arguments 매개변수 넣어서 실행해야함