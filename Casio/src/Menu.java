import java.util.Scanner;

public class Menu {
	Scanner sc=new Scanner(System.in);
	int num;
	
	int mainmenu() {
		  System.out.println("=====================");
	      System.out.println("           °è»ê±â                ");
	      System.out.println("=====================");
	      
	      System.out.println("1¹ø-µ¡¼À"+" "+"2¹ø-»¬¼À");
	      System.out.println("3¹ø-°ö¼À"+" "+"4¹ø-³ª´°¼À");
	      System.out.println("±× ¿ÜÀÇ ¹øÈ£ ÀÔ·Â½Ã Á¾·á");
	      System.out.print("¼±ÅÃÇÏ¼¼¿ä:");
		num=sc.nextInt();
		return num;
	}
	
	
}
