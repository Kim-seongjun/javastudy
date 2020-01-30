import java.util.Scanner;

public class Multiple {
	Scanner sc=new Scanner(System.in);
	double x,y;
	
	void mul() {
		System.out.print("첫번째 숫자를 입력하세요:");
		x=sc.nextDouble();
		System.out.print("두번째 숫자를 입력하세요:");
		y=sc.nextDouble();
		System.out.println("곱한값="+(x*y));
		
	}
}
