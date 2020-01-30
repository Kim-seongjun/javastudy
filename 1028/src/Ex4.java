import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		int sum=0, num=1;
		int key;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력");
		key=sc.nextInt(); //10,100,.....
		while(num<=key) {
			sum += num;
			num++;
		}
		System.out.println("End num="+num);
		System.out.println("key="+key);
		System.out.println("sum="+sum);

	}

}
