import java.util.Scanner;

public class Division {
	Scanner sc=new Scanner(System.in);
	double x,y;
	
	void div() {
		System.out.print("ù��° ���ڸ� �Է��ϼ���:");
		x=sc.nextDouble();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���:");
		y=sc.nextDouble();
		if(x==0 || y==0) {
			System.out.println("0���δ� ������ �����ϴ�.");
		}else
		System.out.println("������="+(x/y));
		
	}
}
