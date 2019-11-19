
public class StaticInnerClass {
	public static void main(String s[]) {
		Outer.inner in = new Outer.inner();	//외부클래스.내재클래스 in = new ~; 생성
		System.out.println("클래스 내재 클래스의 메소드 접근 : " + in.innerMethod());
	}
}
