
public class Ex05_03 implements CharSequence {
	
	String a = "����ִ� �ڹ� ���α׷���!";
	
	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return a.charAt(index);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return a.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) { //����index, ��index�� ����
		// TODO Auto-generated method stub
		return a.subSequence(start, end);
	}
	
	public static void main(String args[]) {
		Ex05_03 b = new Ex05_03(); //��ü����
		
		System.out.println(b.a);
		System.out.println("���ڿ��� ���� : " + b.length());
		System.out.println("5��° ���ڿ��� �� : "+ b.charAt(4));
		System.out.println("6��° ���� 10��° ������ �� : " + b.subSequence(5, 9));
	}
}
