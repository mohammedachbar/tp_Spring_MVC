package modele;

public class User {
	private String login; 
	private String Pass;
	public User(String login, String pass) {
		super();
		this.login = login;
		Pass = pass;
	}
	public User() {
		super();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	@Override
	public String toString() {
		return "User [login=" + login + ", Pass=" + Pass + "]";
	}
	
	
	
	
	
	

}
