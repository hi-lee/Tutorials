
class Outer {	//외부 클래스
	static int x = 10;	//클래스 변수
	int y = 20;	//인스턴스 변수
	public static class inner {	 //클래스 내재 클래스
		String innerMethod() {
			Outer out = new Outer();
			return x + (", " + out.y + " StaticInnerClass");
			 // x: 외부 클래스의 클래스변수, static이 붙어서 접근이 가능하다
		 	// 인스턴스 변수 y 접근하려면 : out.y: out 객체 생성 후  y 사용, 객체변수 있어야 접근가능
		}   
	}
}
