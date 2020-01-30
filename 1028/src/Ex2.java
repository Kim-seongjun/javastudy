
public class Ex2 {

	public static void main(String[] args) {
    //단항>이항(산술>관계>논리)>삼항>대입
	//논리 연산자: !(1순위) &&(2순위) ||(3순위) 
//	int a=10;
//	boolean b;
//	b=a>20 && ++a>5;
//	System.out.println("a="+a+",b="+b);
//	
//	b=a>0 || ++a>5;
//	System.out.println("a="+a+",b="+b);
//	
//	//윤년(2/29)
//	//4의 배수년도
//	//100의 배수년도 제외
//	//400배수년도 윤년
//	int year=2000;
//	//if.....
//	
//	System.out.println("윤년");
	String n="b";
	String product="";
	//if(n.contentEquals("B") || n.contentEquals("b"){}
	switch(n) {     //실수는 에러
	case "C": case "c":
		product+="휴지,";
		break;
	case "B": case "b":
		product+="후라이팬,";
		break;
	case "A": case "a":
		product+="전자렌지,";
		break;
	default:
		product+="수세미,";
	

	}System.out.println("상품은"+product);
	
	
	}

}
