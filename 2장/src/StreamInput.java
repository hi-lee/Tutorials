import java.io.*;

public class StreamInput {
	public static void main(String[] args) throws IOException {
		String name;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("����� �̸��� �Է��ϼ���! : ");
		name = inbr.readLine();
		System.out.print("����� �̸��� " + name + "�Դϴ�.");
	}
}
