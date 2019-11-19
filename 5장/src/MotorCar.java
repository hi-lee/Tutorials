
public class MotorCar {
	protected int velocity = 100;	//protected: 접근허용범위는 패키지~상속 클래스
	protected int wheelNum;
	protected String carName;
	public void speedUp() {
		velocity = velocity +1;
		System.out.println("MotorCar 클래스의 speedUp() 메소드 !!");
	}
	public void speedUp(int velocity) {
		this.velocity += velocity;
		System.out.println("MotorCar 클래스의 speedUp(int Velocity) 메소드!!");
	}
	public void speedDown() {
		velocity = velocity -10;
		if(velocity<0)
			velocity = 0;
	}
	public void stop() {
		velocity = 0;
	}
}
