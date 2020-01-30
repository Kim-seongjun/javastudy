//Array:배열 (중요)
//new 생성 : 인스턴스
public class Ex1 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		//arr:참조변수 new int:배열(인스턴스)
		int total=0;
		for(int i=0;i<arr.length;i++)
			total+=arr[i];
		
		System.out.println("총점="+total);
		System.out.println("평균="+(double)total/arr.length);
//		total+=arr[0];
		//반복문으로 바꾸고 평균을 소수점이하까지 출력
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]); //반복문
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
	}

}
