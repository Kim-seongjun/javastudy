
public class Ex3 {

	public static void main(String[] args) {
		//int형 변경하지 말것
		int a = 1000000; // 1백만
		int b = 2000000; // 2백만
		long c = (long)a * b;  // 2  조
		System.out.println(c); // 2  조
		
		long d = (long)1000000 * 2000000; // 2 조
		System.out.println(d); // 2 조
		
		int e = 1000000 * (1000000 / 1000000); // 1백만
		System.out.println(e); //1백만
		
		
		
		
		

	}

}
