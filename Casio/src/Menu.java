import java.util.Scanner;

public class Menu {
	Scanner sc=new Scanner(System.in);
	int num;
	
	int mainmenu() {
		  System.out.println("=====================");
	      System.out.println("           ����                ");
	      System.out.println("=====================");
	      
	      System.out.println("1��-����"+" "+"2��-����");
	      System.out.println("3��-����"+" "+"4��-������");
	      System.out.println("�� ���� ��ȣ �Է½� ����");
	      System.out.print("�����ϼ���:");
		num=sc.nextInt();
		return num;
	}
	
	
}
