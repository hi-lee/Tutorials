
class MethodCall {
	static int a;	//Ŭ��������
	int b;	//�ν��Ͻ�����
	static void seta(int i) {	//Ŭ�����޼ҵ�, �ȿ��� �ν��Ͻ� ���� ȣ���� X
		a = i;
	}
	void setb(int i) {	//�ν��Ͻ��޼ҵ�, �ȿ��� Ŭ���� ���� ȣ��O
		b = i;
	}
	public static void main(String args[]) {
		MethodCall Obj1 = new MethodCall();
		MethodCall Obj2 = new MethodCall();
		seta(10);
		System.out.println("The value of a is " + a);
		Obj1.seta(20);
		System.out.println("The value of a is " + a);
		System.out.println("The value of a is " + Obj1.a);
		Obj1.setb(30);
		Obj2.setb(40);
		System.out.println("The value of b in Obj1 is " + Obj1.b);
		System.out.println("The value of b in Obj2 is " + Obj2.b);
	}
}
