
class Variables {
	static int var1 = 10; // var1 Ŭ�����޼ҵ�
	int var2 = 20; // var2 �������

	void printTest() {
		int var3 = 30;// var3 println���� ��������
		System.out.println("var3 = " + var3);
		System.out.println("var2  = " + var2);
		System.out.println("var1 = " + var1);
	}

	public static void main(String[] args) {
		Variables myVar = new Variables();
		int var4 = 40;// var4 ���θ޼ҵ� �ȿ��� ����ϴ� ��������
		System.out.println("var4 = " + var4);
		myVar.printTest(); //�ν��Ͻ� �������� �տ� ��ü�̸������ ���ٰ���(myVar.����)
		var1 = 15;	//Variables.var1 ����� ��
		myVar.var2 = 40;
		myVar.printTest();
	}
}
