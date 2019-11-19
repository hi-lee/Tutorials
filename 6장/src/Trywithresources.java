import java.util.*;
import java.io.*;
public class Trywithresources {
	public void getData(String fileName) {
		try(Scanner scanner = new Scanner(new File(fileName))) { //try에 리소스를 잡아주면 close가 자동으로 됨
			System.out.println(scanner.nextLine());
		}catch(IllegalArgumentException | FileNotFoundException | NullPointerException e) {
			System.out.println("오류 발생 !!");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String f = "output.txt";
		Trywithresources twr = new Trywithresources();
		twr.getData(f);
	}
}
