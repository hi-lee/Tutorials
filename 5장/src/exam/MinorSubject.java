package exam;

public class MinorSubject extends MajorSubject {

	@Override
	public void total() {
		super.total(); //���� MajorSubject�� total�� ȣ���ؾ� ������ ��Ż��(super.t)�� ȣ���
		t  = t + getHis() + getSc() + getGym(); //���� t�� super.total�� t 
	}

	@Override
	void setPoint() {
		super.setPoint();
		System.out.print("���� ������ �Է��ϼ��� : ");
		setHis(sc.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
		setSc(sc.nextInt());
		System.out.print("ü�� ������ �Է��ϼ��� : ");
		setGym(sc.nextInt());
	}
}
