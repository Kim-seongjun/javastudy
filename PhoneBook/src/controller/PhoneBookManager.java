package controller;

public class PhoneBookManager {
	package controller;

	import bean.PhoneCompanyInfo;
	import bean.PhoneInfo;
	import bean.PhoneUnivInfo;

	public class PhoneBookManager {
		final int MAX=100;
		private PhoneInfo[] phoneList=new PhoneInfo[MAX];
		private int cnt=0;
		//생성자 생략
		public void inputData() {
			int inputNum;
			System.out.print("입력할 그룹 선택:");
			inputNum=PhoneBook.sc.nextInt();
			
			PhoneInfo info=null;
			switch(inputNum) {
			case INPUT_NUM.NORMAL:
				info=inputNormal();
				break;
			case INPUT_NUM.UNIV:
				info=inputUniv();
				break;
			case INPUT_NUM.COMPANY:
				info=inputCompany();
				break;
			default:	
			}
			
			phoneList[cnt++]=info;
			System.out.println("입력이 완료되었습니다.");
		}
		
		
		private PhoneInfo inputCompany() {
			System.out.print("이름:");
			String name=PhoneBook.sc.next();
			System.out.print("전화번호:");
			String phoneNum=PhoneBook.sc.next();
			System.out.print("회사:");
			String com=PhoneBook.sc.next();
			
			return new PhoneCompanyInfo(name, phoneNum, com);
		}


		private PhoneInfo inputUniv() {
			System.out.print("이름:");
			String name=PhoneBook.sc.next();
			System.out.print("전화번호:");
			String phoneNum=PhoneBook.sc.next();
			System.out.print("전공:");
			String major=PhoneBook.sc.next();
			System.out.print("학년:");
			int year=PhoneBook.sc.nextInt();
			
			return new PhoneUnivInfo(name, phoneNum, major, year);
		}


		private PhoneInfo inputNormal() {
			System.out.print("이름:");
			String name=PhoneBook.sc.next();
			System.out.print("전화번호:");
			String phoneNum=PhoneBook.sc.next();
			
			return new PhoneInfo(name, phoneNum);
		}


		public int searchIdx(String name) {
			for(int i=0;i<cnt;i++) {
				if(name.equals(phoneList[i].getName())) {
					return i; //인덱스
				}
			}
			return -1; //존재하지 않을 경우
		}
		public void searchData() {
			System.out.print("검색할 이름 입력:");
			String name=PhoneBook.sc.next();
			int idx=searchIdx(name);
			
			if(idx!=-1) {
				phoneList[idx].showPhoneInfo();
			}else {
				System.out.println("존재하지 않는 정보입니다.");
			}	
		}
		public void deleteData() {
			System.out.print("삭제할 이름 입력:");
			String name=PhoneBook.sc.next();
			int idx=searchIdx(name);
			
			if(idx!=-1) {
				phoneList[idx]=phoneList[cnt-1];
				cnt--;
				System.out.println("삭제를 완료했습니다.");
			}else {
				System.out.println("존재하지 않는 정보입니다.");
			}
		}
		public void showAllData() {
			System.out.println("전체 정보 출력");
			for(int i=0;i<cnt;i++) {
				phoneList[i].showPhoneInfo();
			}
			System.out.println("------------");
		}
	}


