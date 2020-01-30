package test;

public class PhoneInfo {
	private String name;
	private String pon;
	private String date;
	
	
	//private String[] book=new String[3]; 
   
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPon() {
		return pon;
	}

	public void setPon(String pon) {
		this.pon = pon;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public PhoneInfo(String name, String pon, String date) {
		this.name=name;
		this.pon=pon;
		this.date=date;
		
	}

	public PhoneInfo(String name, String pon) {
		this.name=name;
		this.pon=pon;
	}

	void showPhoneInfo() {
		System.out.println("이름="+this.name+",핸드폰번호="+this.pon+",생년월일="+this.date);
		
	}

}
