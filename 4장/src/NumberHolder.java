
public class NumberHolder {
	public int anInt;
	public float aFloat;

	NumberHolder() {
	} // 2. �Ű����� ���� ������ �����ؾ���(�Ʒ��� �Ű������� ���� �����ڰ� �����ϱ� ����)

	NumberHolder(int anInt, double b) {
		this.anInt = anInt; // 3.(10, 20.5) ���� �޴� �Ű�����, this.anInt->�ڱ��ڽ�class,�������
		aFloat = (float) b;
	}

	public static void main(String[] args) { 
		NumberHolder nh1, nh2;
		nh1 = new NumberHolder(10, 20.5); // 4. nh1 �ʱⰪ����
		nh2 = new NumberHolder(); // 1. �Ű������� ���� ������ -> �Ű������� ���� �����ڸ� �ݵ�� �����
		nh2.anInt = 5; // 4. nh2�� ���� ���⶧���� �ʱⰪ �� (�Ⱦ��� default�� ����)
		nh2.aFloat = 1;
		System.out.println("��ü nh1�� ����� anInt ����" + nh1.anInt + "�̰� aFloat ����" + nh1.aFloat + "�̴�.");
		System.out.println("��ü nh2�� ����� anInt ����" + nh2.anInt + "�̰� aFloat ����" + nh2.aFloat + "�̴�.");
	}
}

//������: �Ű������� �ٸ��� �������̵� ����
//�Ķ�������: Ŭ������ �������