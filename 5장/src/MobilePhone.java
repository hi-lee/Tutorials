
class MobilePhone extends Phone implements Cameralike, Photo{
	public void takePhoto() {	//�������̽��� �޼ҵ� ����, ������(ġȯ)�������
		System.out.println("taking a photo.");
	}
	public void viewPhoto() {	//�������̽��� �޼ҵ� ����, ������(ġȯ)�������
		System.out.println("viewing a photo.");
	}
	public static void main(String[] arags) {
		MobilePhone aMobilePhone = new MobilePhone();	//Mobile��ü����, �������� ��������O(�ݴ��X)
		Phone aPhone = (Phone) aMobilePhone;	//Mobile��ü�� Phone��ü�� ����ȯ
		Cameralike aCameralike = (Cameralike) aMobilePhone;	//Mobile��ü�� Cameralike �� ��ü�� ����ȯ
		System.out.println("*Phone");	//Phone ��ü�� �޼ҵ� ����
		aPhone.callUp();
		aPhone.answer();
		System.out.println("*Cameralike"); //Cameralike �� ��ü�� �޼ҵ� ����
		aCameralike.takePhoto();
		aCameralike.viewPhoto();
		System.out.println("*MobilePhone"); //MobilePhone �� ��ü�� �޼ҵ� ����
		aMobilePhone.callUp();
		aMobilePhone.answer();
		aMobilePhone.takePhoto();
		aMobilePhone.viewPhoto();
//		Cameralike aTest = new Cameralike(); //�������̽��� ������X, ��ӹ��� ����Ŭ������ �����ؾ���
//		aCameralike.callUp();
//		aCameralike.answer();
	try {
		Phone anotherPhone = new Phone();	//	->MobilePhone�� ������Ű�� ����
		MobilePhone anotherMobilePhone = new MobilePhone();
//		anotherPhone = anotherMobilePhone;
		anotherMobilePhone = (MobilePhone)anotherPhone;
	} catch (Exception e) {
		e.getStackTrace();
	}
	}
	@Override
	public boolean editPhoto(String a) {
		// TODO Auto-generated method stub
		if(a != null) {
			System.out.println("photo edit complete.");
			return true;
		} else {
			System.out.println("photo edit errroe");
			return false;
		}
		
	}
	
}
