package main;

public class Ex2 {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 10;
		} catch (Exception e) {
			System.out.println("인덱스 오류");
			System.out.println(e.getMessage());
		}
		System.out.println("정상 진행");
	}

}
