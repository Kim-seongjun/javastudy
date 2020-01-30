package operator;

public class Ex3 {

	public static void main(String[] args) {
		//삼항(조건) 연산자
		int a=10, b=20;
		int max=0;
//		if(a>b) {
//			max=a;
//		}
//		if(a<=b) {
//			max=b;
//		}
//		max=(a>b)?a:b;
//		System.out.println("큰수는"+max);
		String result;
//		result=(a>b)?("a가 크다"):("ab같거나 b가 크다");
//		System.out.println("result="+result);
		
		int num1=10, num2=30, num3=20;
		//삼항연산자만 이용해서 세 정수중 가장 큰 숫자를 구하시오.
//		result=(num1<num2)?("num2가크다"):("num1가 크거나같다.");
//		result=(num2>num3)?("num2가 크다"):("num3가 크거나 같다");
//		System.out.println("result="+result);
		//max=(num1>num2) ? (num1>num3) ? num1:num3 
			//	        : (num2>num3) ? num2:num3;
		if(num1>num2) {
			max=(num1>num3) ? num1:num3;
		}
		if(num1<=num2) {
			max=(num2>num3)?num2:num3;
		}
		System.out.println("가장큰수는"+max);
		
	}
}

