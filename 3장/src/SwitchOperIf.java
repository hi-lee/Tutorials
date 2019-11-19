import java.io.*;

public class SwitchOperIf {
	public static void main(String[] args) throws Exception {
		int jumsu;
		String dept;
		BufferedReader inbr= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("과를 입력하세요 ! : ");
		dept = inbr.readLine();
		jumsu = Integer.parseInt(inbr.readLine());
			
		if(dept=="컴퓨터공학부") {
			System.out.println("학부 : " + dept);
		}else if (dept=="정보통신공학부") {
			System.out.println("학부 : " + dept);
		}else {
			System.out.println("학부 : "+"멀티미디어공학부");
		}
	
	if(jumsu>=90) {	
		System.out.println("당신의 학점은 A입니다.");
	}else if (jumsu>=80){
		System.out.println("당신의 학점은 B입니다.");
	}else if (jumsu>=70){	
		System.out.println("당신의 학점은 C입니다.");
	}else if (jumsu>=60){
		System.out.println("당신의 학점은 D입니다.");
	}else {
		System.out.println("당신의 학점은 F입니다.");
}
}
}
