import java.util.*;
import java.util.StringTokenizer;
public class StrignTokenProg {
	public static void main(String[] arags) {
		StringTokenizer str = new StringTokenizer("2008/02/15", "/");
		int count;
				
		count = str.countTokens();
		System.out.println("�Ľ��� ���ڿ��� ���� �� " + count + " ��");
		
//		 while(str.hasMoreTokens()) {
//			 System.out.println(str.nextToken());
//		 }
		 
		 String [] str1 = new String [count]; //�迭����
		 for(int i = 0; i<count; i++) { //�迭�� index point�� ����ϹǷ� i=0 0���� ����������
			 str1[i] = str.nextToken();
			 System.out.println(str1[i]);

		 }
	}
}

		