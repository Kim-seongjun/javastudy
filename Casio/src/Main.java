import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
	//    
//		//곱셈클래스를 만든다 
	//    
		System.out.print("연산한 수를 입력하세요:");
		 double x = scan.nextInt();
		 double y = scan.nextInt();
		 Test1 t=new Test1();
		 Test2 t2=new Test2();
//		 System.out.println("연산을 선택하세요(*,/):");
		// String str = scan.next();
		 System.out.print("번호선택:");
		 num=scan.nextInt();
		 switch(num) {
		 case 1 : t.div(x,y);
		 break;
		 case 2 : t2.mul(x,y);
		 break;
//		 default : System.out.println("잘못된 연산자:");
		
		//t.div(x,y);

	}

}
}
