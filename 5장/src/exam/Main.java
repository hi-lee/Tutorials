package exam;

public class Main {
	public static void main(String []args) {
		MajorSubject ma = new MajorSubject();
		MinorSubject mi = new MinorSubject();
		ma.setPoint();
		ma.total();
		ma.average(ma.t, 3);
		ma.grade(ma.g);
		System.out.println("국영수 총점 : " + ma.t);	//ma.getTotal() 도 가능
		System.out.println("국영수 평균 : " + ma.a);
		System.out.println("국영수 등급 : " + ma.g);
		System.out.println();
		mi.setPoint();
		mi.total();
		mi.average(mi.t, 6);
		mi.grade(mi.g);
		System.out.println("총점 : " + mi.t);
		System.out.println("평균 : " + mi.a);
		System.out.println("등급 : " + mi.g);
	}

}
