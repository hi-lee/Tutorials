import java.io.*;
public class Ex03_02 {
	public static void main(String []args) throws IOException{
		int intyear;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.print("������ �Ǻ��� �⵵ �Է�! : ");
		intyear = Integer.parseInt(inbr.readLine());
		
		if(intyear%4==0 && intyear%100!=0 || intyear%400==0){
			
			System.out.println(intyear + "���� �����̴�.");			
		}else {
			System.out.println(intyear + "���� ������ �ƴϴ�.");
		}
	}
}
/* if(intyear%400==0) { ����
}else if(intyear%4==0){
	if(intyear%100!=0) {����
	
	}else {���
	}
}else {���}*/