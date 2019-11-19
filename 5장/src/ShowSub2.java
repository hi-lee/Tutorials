
 class ShowSub2 extends ShowClass{
	 int z = 3;
	 void showMe() {
		 super.showMe(); //->동작이 같이됨
		 System.out.println("X is " + x);
		 System.out.println("Y is " + y);
		 System.out.println("Z is " + z);
	 }
	 public static void main(String args[]) {
		 ShowSub2 obj = new ShowSub2();
		 obj.showMe();
	 }

}
