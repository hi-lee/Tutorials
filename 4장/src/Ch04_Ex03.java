
public class Ch04_Ex03 {
	public static void main(String[] args) {
		String a = "Java Programming Very Good";
		String b = "Java Programming";
		String c ="Java ProgramminG";
		String f = "java Programming";
		int d = 'a';
		int e = 'A';
		System.out.println("���ڿ� ���� a�� �� : " + a);
		System.out.println("���ڿ� ���� b�� �� : " + b);

		System.out.println("[compareTo() �޼ҵ�� ���ڿ� ��]");
		System.out.println("a.compareTo(b) �񱳰�� : " + a.compareTo(b));
		System.out.println("b.compareTo(a) �񱳰�� : " + b.compareTo(a));
		System.out.println("b.compareTo(c) �񱳰�� : " + b.compareTo(c));
		System.out.println("���� a�� ������(�ƽ�Ű�ڵ尪): " + d);
		System.out.println("���� A�� ������(�ƽ�Ű�ڵ尪): " + e);
	
		
		System.out.println("[regionMatches() �޼ҵ�� �κ� ���ڿ� ��]");
		System.out.println("�κ� ���ڿ��� �� ��� : " + a.regionMatches(5, f, 5, 11));
		System.out.println("��ҹ��� ���о��� �κй��ڿ��� �񱳰�� : " + a.regionMatches(true, 0, f, 0, 4));
		System.out.println("��ҹ��� �����Ͽ� �κй��ڿ��� �񱳰�� : " + a.regionMatches(false, 0, f, 0, 4));
	}
}
