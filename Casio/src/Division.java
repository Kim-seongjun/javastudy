import java.util.Scanner;

public class Division {
	Scanner sc=new Scanner(System.in);
	double x,y;
	
	void div() {
		System.out.print("첫번째 숫자를 입력하세요:");
		x=sc.nextDouble();
		System.out.print("두번째 숫자를 입력하세요:");
		y=sc.nextDouble();
		if(x==0 || y==0) {
			System.out.println("0으로는 나눌수 없습니다.");
		}else
		System.out.println("나눈값="+(x/y));
		
	}
}
