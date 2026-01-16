package chapter20;

public class UserDTO { // 오라클 환경과 똑같다고 생각하면 됨

	private String userid;
	private String name;
	private String password;
	private int age;
	private String email;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", name=" + name + ", password=" + password + ", age=" + age + ", email="
				+ email + "]";
	}
	
}
