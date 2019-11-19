import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class MethodReferenceExam {
	public static void main(String[] args) {
		IntBinaryOperator oper;
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ���!!!");
		System.out.println("ù��° ���� ��!: ");
		a = input.nextInt();
		System.out.println("�ι�° ���� ��!: ");
		b = input.nextInt();
		
//		���� �޼ҵ� ����
		oper = (x,y) -> ArithmaticOper.plus(x, y);
		int result = oper.applyAsInt(a, b);
		System.out.println("���ٽ� ��� ��� : " + a + " " + "+" + " " + b + " = " + result);
		oper = ArithmaticOper::plus;	//�����޼ҵ�����->Ŭ�����̸�::�޼ҵ��̸�
		result = oper.applyAsInt(a, b);
		System.out.println("���ٽ� ���� �޼ҵ� ���� ��� ��� : " + a + " " + "+" + " " + b + " = " + result);
		
//		�ν��Ͻ� �޼ҵ� ����, ��ü����
		ArithmaticOper aroper = new ArithmaticOper(); 
		oper = (x,y) -> aroper.minus(x, y);			  //ȣ��
		result = oper.applyAsInt(a, b);
		System.out.println("���ٽ� ��� ���: " + a + " " + "+" + " " + b + " = " + result);
		oper = aroper::minus; //�ν��Ͻ� �޼ҵ� ����
		result = oper.applyAsInt(a, b);
		System.out.println("���ٽ� �ν��Ͻ� �޼ҵ� ���� ��� ���: " + a + " " + "+" + " " + b + " = " + result);
	}
}
