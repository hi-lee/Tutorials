
public class MotorCar {
	protected int velocity = 100;	//protected: ������������ ��Ű��~��� Ŭ����
	protected int wheelNum;
	protected String carName;
	public void speedUp() {
		velocity = velocity +1;
		System.out.println("MotorCar Ŭ������ speedUp() �޼ҵ� !!");
	}
	public void speedUp(int velocity) {
		this.velocity += velocity;
		System.out.println("MotorCar Ŭ������ speedUp(int Velocity) �޼ҵ�!!");
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
