package jdbcworks;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String password;
	private long phone;
	private String facebookpassword;
	private String instagrampassword;
	private String telegrampassword;
	private String watsuppassword;
	public String getTelegrampassword() {
		return telegrampassword;
	}
	public void setTelegrampassword(String telegrampassword) {
		this.telegrampassword = telegrampassword;
	}
	public String getWatsuppassword() {
		return watsuppassword;
	}
	public void setWatsuppassword(String watsuppassword) {
		this.watsuppassword = watsuppassword;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	private String twitterpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFacebookpassword() {
		return facebookpassword;
	}
	public void setFacebookpassword(String facebookpassword) {
		this.facebookpassword = facebookpassword;
	}
	public String getInstagrampassword() {
		return instagrampassword;
	}
	public void setInstagrampassword(String instagrampassword) {
		this.instagrampassword = instagrampassword;
	}
	public String getTwitterpassword() {
		return twitterpassword;
	}
	public void setTwitterpassword(String twitterpassword) {
		this.twitterpassword = twitterpassword;
	}
	

}
