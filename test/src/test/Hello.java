package test;

public class Hello {
	public static void main(String[] args) {
		double num1, num2, result;
		num1=1.0000001;
		num2=2.0000001;
		result=num1+num2;
		System.out.println("result="+result);
		long val=10000000000L; //백억
		System.out.println("val="+val);
		//퀴즈
		//int형을 long형으로 바꾸지 말고 해결할 것....
		long a = 1000000L; // 1백만
		long b = 2000000L; // 2백만
		long c = a * b;  // 2  조
		System.out.println(c); // 2  조
		
		/*long d = 1000000 * 2000000; // 2 조
		System.out.println(d); // 2 조
		
		int e = 1000000 * 1000000 / 1000000; // 1백만
		System.out.println(e); //1백만
			*/	
		
	}//main메소드 끝

}//Hello End
