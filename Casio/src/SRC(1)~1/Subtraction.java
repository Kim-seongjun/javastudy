import java.util.Scanner;

public class Subtraction {
	Scanner sc=new Scanner(System.in);
	double x,y;
	
	void sub() {
		System.out.print("ù��° ���ڸ� �Է��ϼ���:");
		x=sc.nextDouble();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
		y=sc.nextDouble();
		System.out.println("����="+(x-y));
	}
}
