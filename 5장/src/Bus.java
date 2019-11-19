
public class Bus extends MotorCar {
	int velocity;

	public void speedUp(int speed) { // �Ű������� �ִ� �޼ҵ带 ġȯ public void speedUp(int velocity)
		velocity += speed; // myBus.speedUp(50);�� ����
		super.speedUp(speed); // super. �Ƚ��ָ� ���ȣ���� ��
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
