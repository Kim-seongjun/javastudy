import java.util.Scanner;

public class Ex3 {  //class

	public static void main(String[] args) {  //main
		//�ν��Ͻ� �迭: ������ �ν��Ͻ��� �����ϴ� �迭
		//�ν��Ͻ��� �迭�� ����ҿ� �ν��Ͻ��� �������� �����Ѵ�.
		String[] list= {"cha","kim","park"};
		//Scanner sc=new Scanner(System.in);
		String temp;
		temp=list[0];
		list[0]=list[list.length-1];
		list[list.length-1]=temp;
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);

		}
//		for(int i=0; i<list.length; i++) { //for�� 1
//			System.out.print(i+1+"��° �Է�:");
//			list[i]=sc.next(); //���ڿ� �Է½�
//		}//End for��
//		for(int i=0; i<list.length; i++) { //for�� 2
//			System.out.println(list[i]);	
		//End for�� 
	}//End main
}//End class
