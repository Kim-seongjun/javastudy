import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		Menu me=new Menu();
		Addition a=new Addition();
		Subtraction b=new Subtraction();
		Multiple c=new Multiple();
		Division d=new Division();
		
		System.out.println("=====================");
		System.out.println("조장:이설형 ");
		System.out.println("아이들:조진우 이현인 이예상");
		
		while(true){
			//메뉴 출력
			num=me.mainmenu();
			if(num>4 || num==0) break;
			switch (num) {
			
			case 1:
				a.add();
				break;
			case 2:
				b.sub();
				break;
			case 3:
				c.mul();
				break;

			case 4:
				d.div();
				break;

			default:
				System.out.println("");
				System.out.println("으이구! 다시!");
				System.out.println("");
				break;
			}
			
			
		}
		
		
		
	}

}
