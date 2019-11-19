import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class MethodReferenceExam {
	public static void main(String[] args) {
		IntBinaryOperator oper;
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요!!!");
		System.out.println("첫번째 정수 값!: ");
		a = input.nextInt();
		System.out.println("두번째 정수 값!: ");
		b = input.nextInt();
		
//		정적 메소드 참조
		oper = (x,y) -> ArithmaticOper.plus(x, y);
		int result = oper.applyAsInt(a, b);
		System.out.println("람다식 사용 결과 : " + a + " " + "+" + " " + b + " = " + result);
		oper = ArithmaticOper::plus;	//정적메소드참조->클래스이름::메소드이름
		result = oper.applyAsInt(a, b);
		System.out.println("람다식 정적 메소드 참조 사용 결과 : " + a + " " + "+" + " " + b + " = " + result);
		
//		인스턴스 메소드 참조, 객체생성
		ArithmaticOper aroper = new ArithmaticOper(); 
		oper = (x,y) -> aroper.minus(x, y);			  //호출
		result = oper.applyAsInt(a, b);
		System.out.println("람다식 사용 결과: " + a + " " + "+" + " " + b + " = " + result);
		oper = aroper::minus; //인스턴스 메소드 참조
		result = oper.applyAsInt(a, b);
		System.out.println("람다식 인스턴스 메소드 참조 사용 결과: " + a + " " + "+" + " " + b + " = " + result);
	}
}
