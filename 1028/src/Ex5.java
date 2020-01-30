import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int total=0, val=1;
		Scanner sc=new Scanner(System.in);
		while(val!=0){
			System.out.println("정수입력");
			val=sc.nextInt();
			total += val;
		}
		System.out.println("total="+total);

	}

}
