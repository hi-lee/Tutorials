import java.io.*;

public class SwitchOperIf {
	public static void main(String[] args) throws Exception {
		int jumsu;
		String dept;
		BufferedReader inbr= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �Է��ϼ��� ! : ");
		dept = inbr.readLine();
		jumsu = Integer.parseInt(inbr.readLine());
			
		if(dept=="��ǻ�Ͱ��к�") {
			System.out.println("�к� : " + dept);
		}else if (dept=="������Ű��к�") {
			System.out.println("�к� : " + dept);
		}else {
			System.out.println("�к� : "+"��Ƽ�̵����к�");
		}
	
	if(jumsu>=90) {	
		System.out.println("����� ������ A�Դϴ�.");
	}else if (jumsu>=80){
		System.out.println("����� ������ B�Դϴ�.");
	}else if (jumsu>=70){	
		System.out.println("����� ������ C�Դϴ�.");
	}else if (jumsu>=60){
		System.out.println("����� ������ D�Դϴ�.");
	}else {
		System.out.println("����� ������ F�Դϴ�.");
}
}
}
