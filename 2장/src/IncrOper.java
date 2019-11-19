
public class IncrOper {
	public static void main(String[] args) {
		int a,b, c, d;
		a=b=c=d=10;
		for(int count=0; count<5; count++) {
			System.out.println("x = "+(a++)+ ", b= "+(++b)+ ", c = "+(c--)+", d ="+(d--));
		}
	}
}
