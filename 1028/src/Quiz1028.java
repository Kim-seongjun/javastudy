
public class Quiz1028 {

	public static void main(String[] args) {
//	int n=70;
//	String grade=null;
//	switch (n/10) {
//			
//	case 10: case 9:
//		grade="A����";
//		break;
//	case 8: 
//		grade="
//	case 7:
//		grade="C����";
//		break;
//	case 6:
//		grade="D����";
//		break;
//	case 5:
//		grade="E����";
//		break;
//	default:
//		grade="F����";
//	}System.out.println("����� ������ "+grade);
	//����(2/29)
//	//4�� ����⵵
//	//100�� ����⵵ ����
//	//400����⵵ ����
//	int year=2000;
	int year=2000;
	if(year%4==0) {
		if(year%100!=0 || year %400==0)
			System.out.println("����");
		else
			System.out.println("������");
	}else
		System.out.println("������");
			 
	}

}
