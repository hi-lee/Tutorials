
public class ThrowExam {
	static int pnum = 70;
	static int inum = 40;
	public static void calc(int num) throws Exception {
		if (num<pnum) {
			throw new Exception("num ���� " + num + " ��  " + pnum + " ���� �۴�.");
		}
	}
	public static void main(String[] args) {
		System.out.println("[ ���� ������ ]");
		try {
			calc(inum);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("���� ������ ���α׷� ���� !!");
		}
	}
}
