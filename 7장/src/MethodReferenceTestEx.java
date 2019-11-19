import java.util.function.*;
public class MethodReferenceTestEx {
	public int add(int a, int b) {
		return a + b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public void oper(IntBinaryOperator operator, int a, int b) {	//IntBinaryOperator: functional interface
		System.out.println("정적/인스턴스 메소드 참조 : " + operator.applyAsInt(a, b)); 
	}
	public void operS(Function<String, String> stringOperator, String a) { //Function: functional interface
		System.out.println("매개변수의 메소드 참조 : " + stringOperator.apply(a));
	}
	public static void main (String [] args) {
		MethodReferenceTestEx ex = new MethodReferenceTestEx();
		
		ex.oper((a,b)-> MethodReferenceTestEx.mul(a,b),1,1);
//		정적 메소드 참조 - 클래스::정적메소드
		ex.oper(MethodReferenceTestEx::mul, 1, 1);	
		
		ex.oper((a, b)-> ex.add(a, b),1,1);
//		인스턴스 메소드 참조 - 참조변수::인스턴스메소드
		ex.oper(ex::add, 1, 1);

		ex.operS(s -> s.toLowerCase(), "STIRNG");
//		매개변수의 메소드 참조 - 클래스::인스턴스메소드
		ex.operS(String::toLowerCase, "STRING");	//값이 가르키는 클래스 이름을 적어야함
	}
}
