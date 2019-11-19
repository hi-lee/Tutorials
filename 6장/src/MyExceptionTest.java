
public class MyExceptionTest {
	public void myMethod() throws MyException {
		MyException me = new MyException("Exception : wrong format");
		throw me;
	}

	public static void main(String[] args) {
		MyExceptionTest mE = new MyExceptionTest();
		try {
			mE.myMethod();
		} catch (MyException me) {	//throw me¿Í ´Ù¸¥ me
			me.printStackTrace();
		}
	}
}
