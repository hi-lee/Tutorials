
class MobilePhone extends Phone implements Cameralike, Photo{
	public void takePhoto() {	//인터페이스의 메소드 구현, 재정의(치환)해줘야함
		System.out.println("taking a photo.");
	}
	public void viewPhoto() {	//인터페이스의 메소드 구현, 재정의(치환)해줘야함
		System.out.println("viewing a photo.");
	}
	public static void main(String[] arags) {
		MobilePhone aMobilePhone = new MobilePhone();	//Mobile객체생성, 상위선언 하위생성O(반대는X)
		Phone aPhone = (Phone) aMobilePhone;	//Mobile객체를 Phone객체로 형변환
		Cameralike aCameralike = (Cameralike) aMobilePhone;	//Mobile객체를 Cameralike 형 객체로 형변환
		System.out.println("*Phone");	//Phone 객체의 메소드 실행
		aPhone.callUp();
		aPhone.answer();
		System.out.println("*Cameralike"); //Cameralike 형 객체의 메소드 실행
		aCameralike.takePhoto();
		aCameralike.viewPhoto();
		System.out.println("*MobilePhone"); //MobilePhone 형 객체의 메소드 실행
		aMobilePhone.callUp();
		aMobilePhone.answer();
		aMobilePhone.takePhoto();
		aMobilePhone.viewPhoto();
//		Cameralike aTest = new Cameralike(); //인터페이스는 생성자X, 상속받은 서브클래스로 생성해야함
//		aCameralike.callUp();
//		aCameralike.answer();
	try {
		Phone anotherPhone = new Phone();	//	->MobilePhone로 생성시키면 가능
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
