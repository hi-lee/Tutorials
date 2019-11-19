import java.util.Scanner;
//import java.io.*;
public class Tr02_04_practice {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		//BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in))
		int price;
		double discount;
		
		System.out.println("상품의 가격을 입력하세요 : ");
		price = sc.nextInt();
		//price = Integer.parseInt(inbr.readLine());
		System.out.println("할인율(%)을 입력하세요 : ");
		discount = sc.nextDouble();
		//discount = Double.parseDouble(inbr.readLine()) / 100;
		
		System.out.println("\n상품가격 : "+price+"원");
		System.out.println("할인율(%) : "+discount);
		System.out.println("세일 가격 : "+price*(0.01*(100-discount))+"원");
										//(price - (price * discount))
		
	}

}
