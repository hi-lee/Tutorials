//Ex06_03
public class ResExceptionTest {
	int oiltank = 0;

	public void methodA(int oil) throws MyException { //6 ���� ����ó�� ��ƾ�� ����
		methodB(oil); //2
	}

	public void methodB(int oil) throws MyException {	//5 �˸���
		if (oil > 80) {
			MyException e = new MyException();	//3 ����� exception ����
			throw e;	//4 ������
		} else {
			oiltank = oiltank + oil;
			System.out.println("���� ������ " + oil + "���� ��ŭ �߰�");
		}
	}

	public static void main(String[] args) {
		ResExceptionTest sonata = new ResExceptionTest();
		try {
			sonata.methodA(90);	// 1 
		} catch (MyException e) { // 7 MyException e = new MyException();
			System.out.println("���� �����ÿ� ��ũ�� ���ļ� ���� �߻�"); //8 ���
		}
	}
}
