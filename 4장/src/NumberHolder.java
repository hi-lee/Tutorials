
public class NumberHolder {
	public int anInt;
	public float aFloat;

	NumberHolder() {
	} // 2. 매개변수 없는 생성자 정의해야함(아래에 매개변수를 가진 생성자가 존재하기 때문)

	NumberHolder(int anInt, double b) {
		this.anInt = anInt; // 3.(10, 20.5) 값을 받는 매개변수, this.anInt->자기자신class,멤버변수
		aFloat = (float) b;
	}

	public static void main(String[] args) { 
		NumberHolder nh1, nh2;
		nh1 = new NumberHolder(10, 20.5); // 4. nh1 초기값지정
		nh2 = new NumberHolder(); // 1. 매개변수를 가진 생성자 -> 매개변수가 없는 생성자를 반드시 써야함
		nh2.anInt = 5; // 4. nh2가 값이 없기때문에 초기값 줌 (안쓰면 default값 나옴)
		nh2.aFloat = 1;
		System.out.println("객체 nh1에 저장된 anInt 값은" + nh1.anInt + "이고 aFloat 값은" + nh1.aFloat + "이다.");
		System.out.println("객체 nh2에 저장된 anInt 값은" + nh2.anInt + "이고 aFloat 값은" + nh2.aFloat + "이다.");
	}
}

//생성자: 매개변수만 다르면 오버라이드 가능
//파란색변수: 클래스의 멤버변수