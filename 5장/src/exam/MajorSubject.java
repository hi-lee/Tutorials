package exam;
import java.util.*;
public class MajorSubject extends SubjectValue implements PointCalc{
	Scanner sc;
	int t;
	double a;
	char g;
	
	public int getT() {
		return t;
	}	
	public double getA() {
		return a;
	}		
	public char setG() {
		return g;
	}
	
	MajorSubject() {
		sc = new Scanner(System.in); 
	}
	
	@Override
	public void total() {
		// TODO Auto-generated method stub

		t = getKor() + getEng() + getMat();	//private선언돼있기 때문에 get method를 통해 접근
	}
	@Override
	public void average(int i, int cnt) {
		// TODO Auto-generated method stub
		
		a = i / cnt;
		
	}
	@Override
	public void grade(double c) {
		// TODO Auto-generated method stub
		if(a >= 90) g = 'A';
		else if(a>=80) g = 'B';
		else if(a>=70) g = 'C';
		else if(a>=60) g = 'D';
		else { g ='F'; }
	}
	
	void setPoint() {
		System.out.print("국어 점수를 입력하세요 : ");
		setKor(sc.nextInt());	//private선언돼있기 때문에 set method를 통해 접근
		System.out.print("영어 점수를 입력하세요 : ");
		setEng(sc.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		setMat(sc.nextInt());
	}

}
