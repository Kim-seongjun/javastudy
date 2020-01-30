//반복문: while, do~while, for
public class Ex3 {
	public static void main(String[] args) {
//		int num=0;
//		while(num<5) {
//			System.out.println("num="+num);
//			num++;
//		}
//
//		System.out.println("종료후 num="+num);
	//}
	//1~10까지의 합을 while문으로 구해서 55를 출력
	   int num=0;
	   int sum=0;
	   while(num<10) {
		   sum+=++num;
	   }
		     System.out.println("num="+sum);
	//임의 정수를 입력받아서 해당 구구단을 출력
	int dan=5;
	//while문을 이용해서 구구단출력
	//5 * 1 = 5
	//5 * 2 = 10
	//5 * 3 = 15
	//5 * 4 = 20
	//5 * 5 = 25
	//5 * 6 = 30
	//5 * 7 = 35
	//5 * 8 = 40
	//5 * 9 = 45
	int n1=0;
	while(n1<9) {
		++n1;
	System.out.println(dan+"*"+n1+"="+(dan*n1));
	}         
	}

}
