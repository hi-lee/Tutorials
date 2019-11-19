
public class Ex05_03 implements CharSequence {
	
	String a = "재미있는 자바 프로그래밍!";
	
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
	public CharSequence subSequence(int start, int end) { //시작index, 끝index값 추출
		// TODO Auto-generated method stub
		return a.subSequence(start, end);
	}
	
	public static void main(String args[]) {
		Ex05_03 b = new Ex05_03(); //객체생성
		
		System.out.println(b.a);
		System.out.println("문자열의 길이 : " + b.length());
		System.out.println("5번째 문자열의 값 : "+ b.charAt(4));
		System.out.println("6번째 부터 10번째 문자의 값 : " + b.subSequence(5, 9));
	}
}
