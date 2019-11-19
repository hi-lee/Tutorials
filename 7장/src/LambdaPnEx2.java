
public class LambdaPnEx2 {
	public static void main(String[] args) {
		FunctionalInterE fi;	//반환값X void
		FunctionalInterR fir;	//int 반환형
		
//		매개변수가 있는 람다식 사용
		fi = (x,y) -> {
			int sum = x+y;
			System.out.println("매개변수가 있는 람다식 사용 - 두 수의 합 : " + sum); };
		fi.method(10, 30);

//		매개변수가 있고 반환값이 있는 람다식 사용
		fir = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println("매개변수가 있고 반환값이 있는 람다식 사용 - 두 수의 합 : " + fir.method(20, 30)); //리턴값 사용하게 만들어야함
	}
}
