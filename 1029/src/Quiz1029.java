import java.util.Scanner;

public class Quiz1029 {
	public static void main(String[] args) {
		//Ű����� ���� 5�� ����(����)�� �Է¹޾Ƽ�
		//����,���(�Ǽ�)�� ����Ͻÿ�.
//		int[][] vr = new int[4][2];
		Scanner sc=new Scanner(System.in);
//		int[] arr=new int[5];
//		int total=0;
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(i+1+"�� �����Է�");
//			arr[i]=sc.nextInt();
//			total+=arr[i];
//		}
//		
////		for(int i=0;i<arr.length;i++) {
////			arr[i]=sc.nextInt();
////			total+=arr[i];
////	}
//		System.out.println("����="+total);
//		System.out.println("���="+(double)total/arr.length);
		//========================================================
//		int[] score=new int[5];
//		//Ű����κ��� 5�� ������ �Է���
//		//�ִ밪, �ּҰ� ����ϱ�
//		for(int i=0;i<score.length;i++) {
//			System.out.print("�Է�");
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
//		System.out.println("�ִ밪="+max);
//		System.out.println("�ּҰ�="+min);
		//========================================================
		
		//�����ο��� ��Ա��ϳ�
//		for (int i = vr.length-1; i >=0; i--) {
//			for(int j = 0 ; j < vr[i].length ; j++) {
//				System.out.println((4-i)+"0"+(j+1)+"ȣ�� ������");
//				vr[i][j] = sc.nextInt();
//			}
//		}
//		int total = 0;
//		for(int i = 0; i < vr.length ; i++) {
//			int eachLayer = 0;   // �� �� �ʱ�ȭ
//			for(int j = 0; j < vr[i].length; j++) {
//				eachLayer += vr[i][j];  //�� �� ���ϱ�(����)
//				System.out.println("   "+(4-i)+"0"+(j+1)+"ȣ�� ������ : "+vr[i][j]+"  |  "+(4-i)+"�� �� ������: "+eachLayer);
//			}
//			total += eachLayer;
//			System.out.println();
//			System.out.println("----------------------");
//		}
//		System.out.println("�� ������ : " + total);
		//===================================================
		//���࿹
		//�����ο� 3, 1���л� ���ð���� 3(20,30,40), 2���л� ���ð���� 5(10,20,30,40,50), 3���л� ���ð���� 2(10,20)
		//1���л� ����,��� 2���л� ����,��� 3���л� ����,���
//		int row=3;
//		int[][] arr = new int[row][];
//		int col1=3;
//		arr[0]=new int[col1];
//		int col2=5;
//		arr[1]=new int[col2];
//		int col3=2;
//		arr[2]=new int[col3];
//		System.out.println(arr[1]+"�� �л��� ����"+col1);
//		
		int[][] arr=new int[3][];
		
		System.out.println(arr);
	}//End main
}//End class
