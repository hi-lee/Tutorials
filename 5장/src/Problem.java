
public class Problem {
	
	
//	static String s;   	1) Add static
//	static class Inner{
//		void testMethod() {
//			s = "set form Inner";

	
//	String s;
//	class Inner {		 2) remove static
//		void testMethod() {
//			s = "set form Inner";
//		}

	
	String s;
	static class Inner {
		Problem p = new Problem();		//3) static¿¡ °´Ã¼»ý¼º
		void testMethod() {
			p.s = "set form Inner";
		}
	}
}
