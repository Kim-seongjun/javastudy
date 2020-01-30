package phone;

public class PhoneBookManager {
	final int MAX=100;
	private PhoneInfo[]phoneList=new PhoneInfo[MAX];
	private int cnt=0;

	public void inputData() {
		int inputNum;
		System.out.println("입력할 그룹 선택:");
		inputNum=PhoneBook.sc.nextInt();
		
		PhoneInfo info=null;
		switch(inputNum) {
		case INPUT_NUM.NORMAL:
			info=inputNormal();
		}
		
	}

	public void searchData() {
		// TODO Auto-generated method stub
		
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		
	}

	public void showallData() {
		// TODO Auto-generated method stub
		
	}

}
