
class Variables {
	static int var1 = 10; // var1 클래스메소드
	int var2 = 20; // var2 멤버변수

	void printTest() {
		int var3 = 30;// var3 println안의 지역변수
		System.out.println("var3 = " + var3);
		System.out.println("var2  = " + var2);
		System.out.println("var1 = " + var1);
	}

	public static void main(String[] args) {
		Variables myVar = new Variables();
		int var4 = 40;// var4 메인메소드 안에서 사용하는 지역변수
		System.out.println("var4 = " + var4);
		myVar.printTest(); //인스턴스 변수들은 앞에 객체이름적어야 접근가능(myVar.변수)
		var1 = 15;	//Variables.var1 안적어도 됨
		myVar.var2 = 40;
		myVar.printTest();
	}
}
