
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
// public void info() {    ->�������� �޼ҵ� ȣ��� �ٷ� ��� �� �� �ְ� ��
// 		System.out.println("�̸� : " + name + ", id : " + id + ", password : " + password + ", phone : " + phone);
//	}
}
