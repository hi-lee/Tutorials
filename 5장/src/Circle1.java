
public class Circle1 extends Point {
	static int noCircle = 0;	//Ŭ��������
	protected int radius;		//�ν��Ͻ�����
	Circle1(int a, int b, int r){	//��������
		x = a;	//x:�ν��Ͻ�, a:����
		y = b;	//y:�ν��Ϥ�, b:����
		radius = r;	//radius:�ν��Ͻ�, r:����
		noCircle++;	//Ŭ����
	}
	public String showCircle() {
		return "Center = " + "(" + x + "," + y + ")" + ", Radius = " + radius;  //�ν��Ͻ�
	}
	public static void main(String args[]) {
		Circle1 MyCircle = new Circle1(30,40,20);	//MyCircle:��������(���θ޼ҵ�ȿ��� ����)
		System.out.println("MyCircle : " + MyCircle.showCircle() + ".");
		System.out.println("The number of circles is " + noCircle + "."); //noCircle:Ŭ����
	}

}
