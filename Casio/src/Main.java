import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
	//    
//		//����Ŭ������ ����� 
	//    
		System.out.print("������ ���� �Է��ϼ���:");
		 double x = scan.nextInt();
		 double y = scan.nextInt();
		 Test1 t=new Test1();
		 Test2 t2=new Test2();
//		 System.out.println("������ �����ϼ���(*,/):");
		// String str = scan.next();
		 System.out.print("��ȣ����:");
		 num=scan.nextInt();
		 switch(num) {
		 case 1 : t.div(x,y);
		 break;
		 case 2 : t2.mul(x,y);
		 break;
//		 default : System.out.println("�߸��� ������:");
		
		//t.div(x,y);

	}

}
}
