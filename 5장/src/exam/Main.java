package exam;

public class Main {
	public static void main(String []args) {
		MajorSubject ma = new MajorSubject();
		MinorSubject mi = new MinorSubject();
		ma.setPoint();
		ma.total();
		ma.average(ma.t, 3);
		ma.grade(ma.g);
		System.out.println("������ ���� : " + ma.t);	//ma.getTotal() �� ����
		System.out.println("������ ��� : " + ma.a);
		System.out.println("������ ��� : " + ma.g);
		System.out.println();
		mi.setPoint();
		mi.total();
		mi.average(mi.t, 6);
		mi.grade(mi.g);
		System.out.println("���� : " + mi.t);
		System.out.println("��� : " + mi.a);
		System.out.println("��� : " + mi.g);
	}

}
