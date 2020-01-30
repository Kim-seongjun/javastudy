package bean;

public class PhoneUnivInfo extends PhoneInfo {
	
	//이름, 전화번호
	private String major; //전공
	private int year; //학년
	
	public PhoneUnivInfo(String name, String phoneNum, String major, int year) {
		super(name, phoneNum);
		this.major=major;
		this.year=year;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공="+this.major);
		System.out.println("학년="+this.year);
		System.out.println("--------------");
	}
	
	

}
