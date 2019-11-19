
public class Class1 {
	protected InnerClass1 ic;
	
	public Class1() {
		ic = new InnerClass1();	//객체가 만들어질 때 객체생성-접근
	}
	public void displayStrings() {
		System.out.println(ic.getString() + ".");
		System.out.println(ic.getAnotherString() + ".");
	}
	static public void main(String[] args) {
		Class1 c1 = new Class1();
		c1.displayStrings();
	}
	protected class InnerClass1 {	//내부클래스
		public String getString() {
			return "InnerClass1: getString invoked";
		}
		public String getAnotherString() {
			return "InnerClass1: getAnotherStirng invoked";
		}
	}
}
