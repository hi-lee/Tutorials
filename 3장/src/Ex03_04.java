import java.io.*;

public class Ex03_04 {
	public static void main(String[] args) throws IOException {
		int r[] = new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� 10���� �Է��ϼ���! : ");
		for (int x = 0; x < r.length; x++) {
			r[x] = Integer.parseInt(inbr.readLine());
		}
		System.out.print("�Է� ������ �� : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		for (int i = 0; i < r.length - 1; i++) {
			for (int j = 0; j < r.length; j++) {
				if (r[i] > r[j]) {
					int tm = r[i];
					r[i] = r[j];
					r[j] = tm;
				}
			}
		}
/* ��������
 * int n=r.length; //�迭�� ũ��
 * int i=1; //ȸ����
 * while(i<n) {
 * 	boolean flag=true; //�÷��� ����
 * 	for(int j=0; j<n-i; j++){
 * 		if(r[j]>r[j+1]){
 * 			int tm = r[j];
 * 			r[j] = r[j+1];
 * 			r[j+1] = tm;
 * 			flag = false;
 */
		System.out.print("�������� ������ �� : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();
		System.out.print("�� �� : ");
		int sum = 0;
		for (int x = 0; x < r.length; x++) {
			sum = sum + r[x];
		}
		System.out.println(sum);
		System.out.print("��� : " + (sum / r.length));
	}
}
