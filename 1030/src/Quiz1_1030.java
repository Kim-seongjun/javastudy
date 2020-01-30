import java.util.Scanner;

public class Quiz1_1030 {

	public static void main(String[] args) {
		//1.
				operation(10,3);
				//----------------------------------
				System.out.println("----------------2----------------");
						//2.
				abs(10,3); //두수의 차의 절대값 :7
				abs(3,10);  //두수의 차의 절대값 :7
				System.out.println("----------------3----------------");
				//3.									//반지름
				System.out.println("원 둘레: "+ cirRound(2.4));
				System.out.println("원 넓이: "+ ciraREA(2.4));
				//원 둘레: xxxx.xx (지름*3.14)
				//원 넓이: xxxx.xx (반지름*반지름*3.14)
				
				
				System.out.println("----------------4----------------");
				//4.
				for(int i=1;i<11;i++) {
					if(isEven(i)) {
					System.out.println(i+":짝수");
					}
				}
				System.out.println("----------------5----------------");
				//5.
				String name=inputName();
				System.out.println("----------------6----------------");
				showName(name);
	}	
	private static void showName(String name) {
		System.out.println("입력한 이름="+name);
	}

	private static String inputName() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름입력 : ");
		String name=sc.next();
		return name;
	} 
	
	private static boolean isEven(int i) {
		if(i%2==0) {
			return true;
		}
		return false;
	}
	
	private static double ciraREA(double d) {
		double ciraREA=d*d*3.14;
		return ciraREA;
	}
	
	private static double cirRound(double d) {
		double cirRound=(d+d)*3.14;
		return cirRound;
	}
	
	private static void abs(int i, int j) {
		int result;
		if(i>j) result=i-j;
		else result=j-i;
		System.out.println("두수의 차와 절대값="+result);
		}
	
	private static void operation(int i, int j) {
		System.out.println("덧셈 결과 :" + (i+j));
		System.out.println("뺄셈 결과 :" + (i-j));
		System.out.println("곱셈 결과 :" + (i*j));
		System.out.println("나눗셈의 몫 :" + (i/j));
		System.out.println("나눗셈의 나머지 :" + (i%j));
		}
}