import java.util.Scanner;
//import java.io.*;
public class Tr02_04_practice {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in))
		int price;
		double discount;
		
		System.out.println("��ǰ�� ������ �Է��ϼ��� : ");
		price = sc.nextInt();
		//price = Integer.parseInt(inbr.readLine());
		System.out.println("������(%)�� �Է��ϼ��� : ");
		discount = sc.nextDouble();
		//discount = Double.parseDouble(inbr.readLine()) / 100;
		
		System.out.println("\n��ǰ���� : "+price+"��");
		System.out.println("������(%) : "+discount);
		System.out.println("���� ���� : "+price*(0.01*(100-discount))+"��");
										//(price - (price * discount))
		
	}

}
