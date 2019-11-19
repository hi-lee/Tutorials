import java.util.function.*;
public class MethodReferenceTestEx {
	public int add(int a, int b) {
		return a + b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public void oper(IntBinaryOperator operator, int a, int b) {	//IntBinaryOperator: functional interface
		System.out.println("����/�ν��Ͻ� �޼ҵ� ���� : " + operator.applyAsInt(a, b)); 
	}
	public void operS(Function<String, String> stringOperator, String a) { //Function: functional interface
		System.out.println("�Ű������� �޼ҵ� ���� : " + stringOperator.apply(a));
	}
	public static void main (String [] args) {
		MethodReferenceTestEx ex = new MethodReferenceTestEx();
		
		ex.oper((a,b)-> MethodReferenceTestEx.mul(a,b),1,1);
//		���� �޼ҵ� ���� - Ŭ����::�����޼ҵ�
		ex.oper(MethodReferenceTestEx::mul, 1, 1);	
		
		ex.oper((a, b)-> ex.add(a, b),1,1);
//		�ν��Ͻ� �޼ҵ� ���� - ��������::�ν��Ͻ��޼ҵ�
		ex.oper(ex::add, 1, 1);

		ex.operS(s -> s.toLowerCase(), "STIRNG");
//		�Ű������� �޼ҵ� ���� - Ŭ����::�ν��Ͻ��޼ҵ�
		ex.operS(String::toLowerCase, "STRING");	//���� ����Ű�� Ŭ���� �̸��� �������
	}
}
