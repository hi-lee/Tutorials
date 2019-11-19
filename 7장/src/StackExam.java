//EX07_01
public class StackExam {
	public static void main(String[] args) {
		Stack<String> ss = new Stack<String>(); // String 타입의 Stack 생성
		ss.push("Apple"); // 스택에 요소 저장
		ss.push("Banana");
		ss.push("Orange");

		System.out.println(ss.pop()); // 스택에 저장된 요소 꺼냄
		System.out.println(ss.pop());
		System.out.println(ss.pop());

		Stack<Integer> is = new Stack<Integer>(); // Integer 타입의 Stack 생성
		is.push(3);
		is.push(7);
		is.push(9);
		for (int i = 0; i < 30; i++) { // 16까지 가능(위에서 값3개 사용)
			is.push(i);
		}
		System.out.println(is.pop());
		System.out.println(is.pop());
		System.out.println(is.pop());
	}
}
