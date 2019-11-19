
public class Bus extends MotorCar {
	int velocity;

	public void speedUp(int speed) { // 매개변수가 있는 메소드를 치환 public void speedUp(int velocity)
		velocity += speed; // myBus.speedUp(50);를 넣음
		super.speedUp(speed); // super. 안써주면 재귀호출이 됨
		if (super.velocity < velocity)
			velocity = 100;
	}

	public int getMotorCarVelocity() {
		return super.velocity; // 150
	}

	public int getBusVelocity() {
		return this.velocity; // 50
	}

	public static void main(String args[]) {
		Bus myBus = new Bus();
		myBus.speedUp(50);
		System.out.println("Bus speed -> " + myBus.getBusVelocity());
		System.out.println("Car speed -> " + myBus.getMotorCarVelocity());
	}
}
