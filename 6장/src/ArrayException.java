
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
			System.out.println("�� ���� �� = " + sum);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�迭 �ε����Ǽ��� �����ϰų� ���ڷ� ��ȯ�� �� ���� ���� �߻�");
		} catch (Exception e) {
			System.out.println("�� �� ���� ���ܰ� �߻�");
		}
	}
}
// Run Configuration>Arguments �Ű����� �־ �����ؾ���