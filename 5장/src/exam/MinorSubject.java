package exam;

public class MinorSubject extends MajorSubject {

	@Override
	public void total() {
		super.total(); //상위 MajorSubject의 total을 호출해야 국영수 토탈값(super.t)이 호출됨
		t  = t + getHis() + getSc() + getGym(); //뒤의 t는 super.total의 t 
	}

	@Override
	void setPoint() {
		super.setPoint();
		System.out.print("역사 점수를 입력하세요 : ");
		setHis(sc.nextInt());
		System.out.print("과학 점수를 입력하세요 : ");
		setSc(sc.nextInt());
		System.out.print("체육 점수를 입력하세요 : ");
		setGym(sc.nextInt());
	}
}
