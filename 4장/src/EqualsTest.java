
public class EqualsTest {
	public static void main (String [] args) {
		String str1, str2;
		str1 = "You were born to be loved.";
		str2 = str1;
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		System.out.println("Same object? " + (str1 == str2));
		str2 = new String(str1);
		System.out.println("String1: "  + str1);
		System.out.println("String2: " + str2);
		System.out.println("Same obgect? " + (str1 == str2));
		System.out.println("Same value? " + str1.equals(str2));
	}
}
