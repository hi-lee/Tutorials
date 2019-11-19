
public class Array1Prog {
	public static void main(String[] args) {
		int[] arycount = { 10, 20, 30, 40, 50 };
		int[] subject = new int[5];
		int sum = 0;

		for (int x = 0; x < subject.length; x++) {
			subject[x] = x + 5;
		}
		for (int y = 0; y < arycount.length; y++) {
			System.out.println("arycount[" + y + "] = " + arycount[y]);
		}
		for (int z = 0; z < subject.length; z++) {
			sum = sum + subject[z];
		}
		System.out.println("배열 subject의 합 : " + sum);
	}
}
