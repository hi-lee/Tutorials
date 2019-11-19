
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
		System.out.println("[ 메소드 치환과 은닉 ]");
		Animal.testClassMethod();
		Cat.testClassMethod();
		testClassMethod();
		myCat.testClassMethod();   //인스턴스.클래스호출 -> 권장X
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();
	}

}
