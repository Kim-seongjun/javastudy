import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr=createArray();
		arr=iputArray(arr);
		showArray(arr);//���
		System.out.println("=======");
		increamentArry(arr);//����
		showArray(arr);
        int tot=sumArray(arr);
	}

	private static int sumArray(int[] arr) {
		int tot=0;
		for (int i=0;i<arr.length;i++){
			tot+=arr[i];
		}
		
		System.out.println("����="+tot);
		return tot;
	}

	private static void increamentArry(int[] arr) {
		for (int i = 0; i < arr.length;i++) {
			arr[i]++;
		}
		
		
	}

	private static int[] iputArray(int[] arr) {
		Scanner input= new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
		arr[i]=input.nextInt();}
		return arr;
		
	}

	private static int[] createArray() {
		int[] arr=new int[5];
		return arr;
	}

	private static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}

	}

}
