package springmvc.model;

public class User {
	private String userName;
	private String email;
	private String passwd;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return passwd;
	}
	public void setPassword(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + passwd + "]";
	}
}
