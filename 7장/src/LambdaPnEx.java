
public class LambdaPnEx {
	public static void main(String[] args) {
		FunctionalInter fi;
		fi = new FunctionalInter() { //�������̽�X(�̸��� ����)
			public void method() {
				System.out.println("�͸� Ŭ����");
			}
		};
		fi.method();

//		���ٽ� ���
		fi = () -> {
			System.out.println("���� ǥ���� 1");
		};
		fi.method();
		fi = () -> {
			String str = "���� ǥ���� 2";
			System.out.println(str);
		};
		fi.method();
		fi = () -> System.out.println("���� ǥ���� 3");
		fi.method();

	}

}
