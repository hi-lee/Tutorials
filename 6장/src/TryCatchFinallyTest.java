
public class TryCatchFinallyTest {
	public static void main(String[] args) {
		int x, y, sum;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			sum = x / y;
			System.out.println(x + " 를 " + y + " 로 나누면 값은 : " + sum);
			
		}catch (ArithmeticException e) {
			System.out.println("분모를 0으로 나누어 예외 발생 !");
		}catch (Exception e) {
			System.out.println("배열 인덱스 예외가 발생");
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
