package test;

public class PhoneBookManager {
	PhoneInfo[] phoneList = new PhoneInfo[100];
	String name;
	String phoneNum;
	String birth;
	int cnt;

//	int search(String name) {
//	final int MAX=100;
//	PhoneInfo[] phoneList=new PhoneInfo[MAX];
//	int cnt=0;
//	}

	void readData() {
		PhoneInfo info = new PhoneInfo(name, phoneNum, birth);
		phoneList[cnt++] = info;
		System.out.println("입력이 완료되었습니다.");

	}

	public int searchIdax(String name) {
		for (int i = 0; i < cnt; i++) {
			if (name.equals(phoneList[i].getName())) {
				phoneList[i].showPhoneInfo();
				return i;
			}

		}
		return -1;
	}

	public void searchData() {
		System.out.println("검색할 이름 입력");
		String name = PhoneBook.sc.next();
		int idx = searchIdax(name);

		if (idx != -1) {
			phoneList[idx].showPhoneInfo();

		} else {
			System.out.println("존재하지 않는 정보입니다.");           
		}
//		for (int i = 0; i < cnt; i++) {
//			if (name.equals(phoneList[i].getName())) {
//				phoneList[i].showPhoneInfo();
//				return; // 동명이인이 없는 경우
//			}
//		}

	}

	public void deleteData1() {
		System.out.println("삭제할 이름 입력:");
		String name = PhoneBook.sc.next();
		for (int i = 0; i < cnt; i++) {
			phoneList[i] = phoneList[cnt - 1];
			cnt--;
			return;
		}
		System.out.println();
	}

	public void inputData() {
		int subMenu=1;
		switch(subMenu) {
		case 1:
			System.out.println("이름:");
			String name=PhoneBook.sc.next();
			System.out.println("전화번호:");
			String PhoneNum=PhoneBook.sc.next();
			PhoneInfo info=new PhoneInfo(name,PhoneNum);
			phoneList[cnt]=info;
			cnt++;
			break;

			//일반친구 입력 메소드
		case 2:System.out.println("이름:");
		String name2=PhoneBook.sc.next();
		System.out.println("전화번호:");
		String PhoneNum2=PhoneBook.sc.next();
		System.out.println("전공:");
		String major=PhoneBook.sc.next();
		System.out.println("학년:");
		String year=PhoneBook.sc.next();
		PhoneInfo info=new  PhoneUnivInfo (name2,PhoneNum2,major,year);
		phoneList[cnt]=info;
		cnt++;
		break;

//		  *전공: String major
//		  *학년: int year

			//학교친구 입력 메소드
		case 3:System.out.println("이름:");
		String name3=PhoneBook.sc.next();
		System.out.println("전화번호:");
		String PhoneNum3=PhoneBook.sc.next();
	    System.out.println("회사:");
	    String company=PhoneBook.sc.next();
	    PhoneInfo info=new PhneCompanyInfo(name3,PhoneNum3,company);
		phoneList[cnt]=info;
		cnt++;
        break;

		}
		
		

	}

	public void showallDatal() {
		
		
	}

}
