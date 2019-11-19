
class MethodCall {
	static int a;	//클래스변수
	int b;	//인스턴스변수
	static void seta(int i) {	//클래스메소드, 안에서 인스턴스 변수 호출은 X
		a = i;
	}
	void setb(int i) {	//인스턴스메소드, 안에서 클래스 변수 호출O
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
