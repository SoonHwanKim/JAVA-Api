package Map;

public class Meber {
	private String name, addr, id, pass, age; // 회원이름, 주소, 나이, 아이디, 비번
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getId() {
		return id;
	}
	public String getPass() {
		return pass;
	}
	public String getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "회원정보 [이름=" + name + ", 주소=" + addr + ", 아이디=" + id + ", 비밀번호=" + pass + ", 나이=" + age + "]";
	}
	

}
