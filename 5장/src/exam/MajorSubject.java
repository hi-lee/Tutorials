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

		t = getKor() + getEng() + getMat();	//private������ֱ� ������ get method�� ���� ����
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
		System.out.print("���� ������ �Է��ϼ��� : ");
		setKor(sc.nextInt());	//private������ֱ� ������ set method�� ���� ����
		System.out.print("���� ������ �Է��ϼ��� : ");
		setEng(sc.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
		setMat(sc.nextInt());
	}

}
