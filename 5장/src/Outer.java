
class Outer {	//�ܺ� Ŭ����
	static int x = 10;	//Ŭ���� ����
	int y = 20;	//�ν��Ͻ� ����
	public static class inner {	 //Ŭ���� ���� Ŭ����
		String innerMethod() {
			Outer out = new Outer();
			return x + (", " + out.y + " StaticInnerClass");
			 // x: �ܺ� Ŭ������ Ŭ��������, static�� �پ ������ �����ϴ�
		 	// �ν��Ͻ� ���� y �����Ϸ��� : out.y: out ��ü ���� ��  y ���, ��ü���� �־�� ���ٰ���
		}   
	}
}
