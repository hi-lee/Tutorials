
public class StaticInnerClass {
	public static void main(String s[]) {
		Outer.inner in = new Outer.inner();	//�ܺ�Ŭ����.����Ŭ���� in = new ~; ����
		System.out.println("Ŭ���� ���� Ŭ������ �޼ҵ� ���� : " + in.innerMethod());
	}
}
