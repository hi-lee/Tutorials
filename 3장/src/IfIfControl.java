
public class IfIfControl {
	public static void main(String[] args) {
		int x=40;
		int y=60;
		int z=70;
		
		if(y>x) {
			if(y<z) {
				System.out.println("y는 x보다 크고, y는 z보다 작다");	
			}else {
				System.out.println("y는 x보다 크고, y는 z보다 크다");
			}
		}else {
			//else if(true)
			System.out.println("y는 x보다 ");
		}
	}
}
