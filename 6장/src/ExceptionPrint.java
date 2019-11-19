
public class ExceptionPrint {
	public static void main(String[] args) {
		int div;
		try {
			div = 10/0;
			System.out.println("결과 출력 : " + div);
		}catch(Exception e) {
			System.out.println("[ 예외 정보 얻기 ]");
			System.out.println("[e] : " + e);
			System.out.println("[e.getMessage()]" + e.getMessage());
			System.out.println("[e.toString()]" + e.toString());
			System.out.println("[e.printStackTrace()] :");
			e.printStackTrace();
		}
	}
}
