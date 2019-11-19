import java.io.*;
public class Ex03_02 {
	public static void main(String []args) throws IOException{
		int intyear;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.print("윤년을 판별할 년도 입력! : ");
		intyear = Integer.parseInt(inbr.readLine());
		
		if(intyear%4==0 && intyear%100!=0 || intyear%400==0){
			
			System.out.println(intyear + "년은 윤년이다.");			
		}else {
			System.out.println(intyear + "년은 윤년이 아니다.");
		}
	}
}
/* if(intyear%400==0) { 윤년
}else if(intyear%4==0){
	if(intyear%100!=0) {윤년
	
	}else {평년
	}
}else {평년}*/