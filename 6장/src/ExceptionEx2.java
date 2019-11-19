//Ex06_02
public class ExceptionEx2 {
	public static void main(String args[]) {
		try {
			methodA(); // 1 호출
		} catch(Exception e) {
			System.out.println("main 메소드 출력");	//7 출력
		}
	}
	static void methodA() {
		try {
			methodB(); // 2 호출
			System.out.println("methodA의 try 블록 출력");
		} catch(ArithmeticException e) {	//4 NullPointerException이라 안걸림 -> 6 출력X
			System.out.println("methodA 의 catch 블록 출력");
		} finally {
			System.out.println("methodA의 finally 블록 출력"); // 5 무조건 실행되는 구문, 출력
		}
		System.out.println("methodA 출력");	//6 출력X, catch에서 잡혀야 출력됨
	}
	static void methodB() {
		throw new NullPointerException(); //3
	}
}
