
public class TryCatchFinallyTest {
	public static void main(String[] args) {
		int x, y, sum;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			sum = x / y;
			System.out.println(x + " �� " + y + " �� ������ ���� : " + sum);
			
		}catch (ArithmeticException e) {
			System.out.println("�и� 0���� ������ ���� �߻� !");
		}catch (Exception e) {
			System.out.println("�迭 �ε��� ���ܰ� �߻�");
		}finally {
			System.out.println("���α׷� ����");
		}
	}
}
