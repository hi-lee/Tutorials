
public class Ch04_Ex03 {
	public static void main(String[] args) {
		String a = "Java Programming Very Good";
		String b = "Java Programming";
		String c ="Java ProgramminG";
		String f = "java Programming";
		int d = 'a';
		int e = 'A';
		System.out.println("문자열 변수 a의 값 : " + a);
		System.out.println("문자열 변수 b의 값 : " + b);

		System.out.println("[compareTo() 메소드로 문자열 비교]");
		System.out.println("a.compareTo(b) 비교결과 : " + a.compareTo(b));
		System.out.println("b.compareTo(a) 비교결과 : " + b.compareTo(a));
		System.out.println("b.compareTo(c) 비교결과 : " + b.compareTo(c));
		System.out.println("문자 a의 정수값(아스키코드값): " + d);
		System.out.println("문자 A의 정수값(아스키코드값): " + e);
	
		
		System.out.println("[regionMatches() 메소드로 부분 문자열 비교]");
		System.out.println("부분 문자열의 비교 결과 : " + a.regionMatches(5, f, 5, 11));
		System.out.println("대소문자 구분없이 부분문자열의 비교결과 : " + a.regionMatches(true, 0, f, 0, 4));
		System.out.println("대소문자 구분하여 부분문자열의 비교결과 : " + a.regionMatches(false, 0, f, 0, 4));
	}
}
