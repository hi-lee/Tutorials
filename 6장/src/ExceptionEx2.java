//Ex06_02
public class ExceptionEx2 {
	public static void main(String args[]) {
		try {
			methodA(); // 1 ȣ��
		} catch(Exception e) {
			System.out.println("main �޼ҵ� ���");	//7 ���
		}
	}
	static void methodA() {
		try {
			methodB(); // 2 ȣ��
			System.out.println("methodA�� try ��� ���");
		} catch(ArithmeticException e) {	//4 NullPointerException�̶� �Ȱɸ� -> 6 ���X
			System.out.println("methodA �� catch ��� ���");
		} finally {
			System.out.println("methodA�� finally ��� ���"); // 5 ������ ����Ǵ� ����, ���
		}
		System.out.println("methodA ���");	//6 ���X, catch���� ������ ��µ�
	}
	static void methodB() {
		throw new NullPointerException(); //3
	}
}
