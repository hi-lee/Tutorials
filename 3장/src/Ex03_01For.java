import java.io.*;

public class Ex03_01For {
	public static void main(String[] args) throws IOException {
		int intvalue;
		int resvalue = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.print("���ڸ� �Է��ϼ��� : ");

		for (intvalue = Integer.parseInt(inbr.readLine()); intvalue > 0; intvalue = intvalue / 10) {
			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);

		}

		System.out.print("�ٲ� ���� : " + resvalue);
	}
}

/*for���� �ʱⰪ : while�� ����
*for(; ���ǽ�; ) : while(���ǽ�)
for���� ������ : while�� �Ʒ��� */