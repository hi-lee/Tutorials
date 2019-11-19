
public class AssigOper {
	public static void main(String[] args) {
		int x, y, z=0;
		x=y=z=100;
		z+=x+y;
		x+=y-=z*=5;
		x+=y=z;
		System.out.println("x = "+x+ ", y = "+y+", z = "+z);
	}
}
