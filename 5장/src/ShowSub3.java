
class ShowSub3 extends ShowClass {
	int z = 3;
	void showMe() {
		super.showMe();
		System.out.println("Z is " + z);
	}
	public static void main(String[] args) {
		ShowSub3 obj = new ShowSub3();
		obj.showMe();
	}

}
