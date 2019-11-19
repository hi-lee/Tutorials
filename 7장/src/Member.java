
public class Member {
	String name;
	String id;
	String password;
	String tel;
	
	public String getName() {
		return name;
	}
	public String id() {
		return id;
	}
	public String password() {
		return password;
	}
	public String tel() {
		return tel;
	}
	
	public Member(String name, String id, String password, String tel) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
	}
// public void info() {    ->정보보기 메소드 호출시 바로 사용 할 수 있게 함
// 		System.out.println("이름 : " + name + ", id : " + id + ", password : " + password + ", phone : " + phone);
//	}
}
