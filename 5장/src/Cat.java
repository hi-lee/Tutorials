
public class Cat extends Animal {
	public static void testClassMethod() {
		System.out.println("The class method in Cat.");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Cat.");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		System.out.println("[ �޼ҵ� ġȯ�� ���� ]");
		Animal.testClassMethod();
		Cat.testClassMethod();
		testClassMethod();
		myCat.testClassMethod();   //�ν��Ͻ�.Ŭ����ȣ�� -> ����X
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();
	}

}
