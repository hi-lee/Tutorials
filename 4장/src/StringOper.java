
public class StringOper {
	public static void main (String[] arags) {
		String mystr1 = new String("Java");
		String mystr2 = new String(".NET");
		String mystr3 = mystr1;
//		System.out.println("Same object? " + mystr1 == mystr3);
		String mystr4 = mystr1 + mystr2;
		mystr3 = mystr3 + "Powerful";
//		mystr3 = mystr3 + "";
//		System.out.println("Same object? " + mystr1 == mystr3);
		
		System.out.println("mystr1 = : " + mystr1);
		System.out.println("mystr3 = : " + mystr3);
		System.out.println("mystr4 = : " + mystr4);
		
	}
}
