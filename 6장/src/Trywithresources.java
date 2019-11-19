import java.util.*;
import java.io.*;
public class Trywithresources {
	public void getData(String fileName) {
		try(Scanner scanner = new Scanner(new File(fileName))) { //try�� ���ҽ��� ����ָ� close�� �ڵ����� ��
			System.out.println(scanner.nextLine());
		}catch(IllegalArgumentException | FileNotFoundException | NullPointerException e) {
			System.out.println("���� �߻� !!");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String f = "output.txt";
		Trywithresources twr = new Trywithresources();
		twr.getData(f);
	}
}
