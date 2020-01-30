package test;

public class PhoneUnivInfo extends PhoneInfo {
	private String name;
	private String pon;
	private String major;
	int year;
	
	
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

	public String major() {
		return major;
	}

	public void major(String major) {
		this.major = major;
	}

	public PhoneUnivInfo (String name, String pon, String major, String year2) {
		this.name=name;
		this.pon=pon;
		this.major=major;
		
		
	}

	
	

	void showPhoneInfo() {
		System.out.println("이름="+this.name+",핸드폰번호="+this.pon+",=전공"+this.major);
		
	}

}
}
