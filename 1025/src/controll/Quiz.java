package controll;
public class Quiz {
	public static void main(String[] args) {
		//90점 이상 : A학점, 80점 이상: B학점,
		//70점 이상: C학점 나머지는 F학점으로 처리하도록 작성 한다.
		int ave=90; //0~100사이만 저장함
		//if문, if~else문 적절히 사용
		//A학점입니다.
		if(ave>=90) {
			System.out.println("A학점");
		} else if(ave>=80) {
			System.out.println("B학점");
		} else if(ave>=70) {
			System.out.println("C학점");
		} else if(ave <70) {
			System.out.println("F학점");
		}
	}
}
