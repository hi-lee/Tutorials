//Ex06_03
public class ResExceptionTest {
	int oiltank = 0;

	public void methodA(int oil) throws MyException { //6 상위 예외처리 루틴에 전달
		methodB(oil); //2
	}

	public void methodB(int oil) throws MyException {	//5 알리기
		if (oil > 80) {
			MyException e = new MyException();	//3 사용자 exception 생성
			throw e;	//4 던지기
		} else {
			oiltank = oiltank + oil;
			System.out.println("차에 주유를 " + oil + "리터 만큼 추가");
		}
	}

	public static void main(String[] args) {
		ResExceptionTest sonata = new ResExceptionTest();
		try {
			sonata.methodA(90);	// 1 
		} catch (MyException e) { // 7 MyException e = new MyException();
			System.out.println("차에 주유시에 탱크가 넘쳐서 에외 발생"); //8 출력
		}
	}
}
