import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		String name1="cho";
		String name2="kim";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�̸��Է�:");
		String name3=sc.next();
		
		if(name1.contentEquals(name3))
			System.out.println("�������� ����.");
		else
			System.out.println("�������� �ٸ���.");
		
		switch(name1) {
		case "cha":
			System.out.println("cha");
		case"kim":
			System.out.println("kim");
			
		}
	
		
		
	}

}
