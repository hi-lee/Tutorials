
public class LambdaPnEx {
	public static void main(String[] args) {
		FunctionalInter fi;
		fi = new FunctionalInter() { //인터페이스X(이름만 동일)
			public void method() {
				System.out.println("익명 클래스");
			}
		};
		fi.method();

//		람다식 사용
		fi = () -> {
			System.out.println("람다 표현식 1");
		};
		fi.method();
		fi = () -> {
			String str = "람다 표현식 2";
			System.out.println(str);
		};
		fi.method();
		fi = () -> System.out.println("람다 표현식 3");
		fi.method();

	}

}
