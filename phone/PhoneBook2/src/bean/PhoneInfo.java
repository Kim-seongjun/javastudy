package bean;
//Data Class
public class PhoneInfo {
	private String name;
	private String phoneNum;
	
	public PhoneInfo(String name, String phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	
	public void showPhoneInfo() {
		System.out.println("name="+name);
		System.out.println("phoneNum="+phoneNum);
	}
}
