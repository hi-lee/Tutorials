
public class IfIfControl {
	public static void main(String[] args) {
		int x=40;
		int y=60;
		int z=70;
		
		if(y>x) {
			if(y<z) {
				System.out.println("y�� x���� ũ��, y�� z���� �۴�");	
			}else {
				System.out.println("y�� x���� ũ��, y�� z���� ũ��");
			}
		}else {
			//else if(true)
			System.out.println("y�� x���� ");
		}
	}
}
