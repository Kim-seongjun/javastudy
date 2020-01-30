
public class Quiz1028 {

	public static void main(String[] args) {
//	int n=70;
//	String grade=null;
//	switch (n/10) {
//			
//	case 10: case 9:
//		grade="A학점";
//		break;
//	case 8: 
//		grade="
//	case 7:
//		grade="C학점";
//		break;
//	case 6:
//		grade="D학점";
//		break;
//	case 5:
//		grade="E학점";
//		break;
//	default:
//		grade="F학점";
//	}System.out.println("당신의 학점은 "+grade);
	//윤년(2/29)
//	//4의 배수년도
//	//100의 배수년도 제외
//	//400배수년도 윤년
//	int year=2000;
	int year=2000;
	if(year%4==0) {
		if(year%100!=0 || year %400==0)
			System.out.println("윤년");
		else
			System.out.println("비윤년");
	}else
		System.out.println("비윤년");
			 
	}

}
