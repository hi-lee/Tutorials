
public class ExceptionPrint {
	public static void main(String[] args) {
		int div;
		try {
			div = 10/0;
			System.out.println("��� ��� : " + div);
		}catch(Exception e) {
			System.out.println("[ ���� ���� ��� ]");
			System.out.println("[e] : " + e);
			System.out.println("[e.getMessage()]" + e.getMessage());
			System.out.println("[e.toString()]" + e.toString());
			System.out.println("[e.printStackTrace()] :");
			e.printStackTrace();
		}
	}
}
