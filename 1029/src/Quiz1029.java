import java.util.Scanner;

public class Quiz1029 {
	public static void main(String[] args) {
		//키보드로 부터 5개 점수(정수)를 입력받아서
		//총점,평균(실수)을 출력하시오.
//		int[][] vr = new int[4][2];
		Scanner sc=new Scanner(System.in);
//		int[] arr=new int[5];
//		int total=0;
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(i+1+"번 점수입력");
//			arr[i]=sc.nextInt();
//			total+=arr[i];
//		}
//		
////		for(int i=0;i<arr.length;i++) {
////			arr[i]=sc.nextInt();
////			total+=arr[i];
////	}
//		System.out.println("총점="+total);
//		System.out.println("평균="+(double)total/arr.length);
		//========================================================
//		int[] score=new int[5];
//		//키보드로부터 5개 정수를 입력후
//		//최대값, 최소값 출력하기
//		for(int i=0;i<score.length;i++) {
//			System.out.print("입력");
//			score[i]=sc.nextInt();
//		} int max, min;
//		max=min=score[0];
//		for(int i=1;i<score.length;i++) {
//			if(max<score[i]) {
//				max=score[i];
//			}
//			if(min>score[i]) {
//				min=score[i];
//			}
//		}
//		System.out.println("최대값="+max);
//		System.out.println("최소값="+min);
		//========================================================
		
		//빌라인원을 어떻게구하냐
//		for (int i = vr.length-1; i >=0; i--) {
//			for(int j = 0 ; j < vr[i].length ; j++) {
//				System.out.println((4-i)+"0"+(j+1)+"호의 가구수");
//				vr[i][j] = sc.nextInt();
//			}
//		}
//		int total = 0;
//		for(int i = 0; i < vr.length ; i++) {
//			int eachLayer = 0;   // 각 층 초기화
//			for(int j = 0; j < vr[i].length; j++) {
//				eachLayer += vr[i][j];  //각 층 더하기(누적)
//				System.out.println("   "+(4-i)+"0"+(j+1)+"호의 가구수 : "+vr[i][j]+"  |  "+(4-i)+"층 총 가구수: "+eachLayer);
//			}
//			total += eachLayer;
//			System.out.println();
//			System.out.println("----------------------");
//		}
//		System.out.println("총 가구수 : " + total);
		//===================================================
		//실행예
		//응시인원 3, 1번학생 응시과목수 3(20,30,40), 2번학생 응시과목수 5(10,20,30,40,50), 3번학생 응시과목수 2(10,20)
		//1번학생 총점,평균 2번학생 총점,평균 3번학생 총점,평균
//		int row=3;
//		int[][] arr = new int[row][];
//		int col1=3;
//		arr[0]=new int[col1];
//		int col2=5;
//		arr[1]=new int[col2];
//		int col3=2;
//		arr[2]=new int[col3];
//		System.out.println(arr[1]+"번 학생의 점수"+col1);
//		
		int[][] arr=new int[3][];
		
		System.out.println(arr);
	}//End main
}//End class
