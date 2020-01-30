import java.util.Scanner;

public class Ex3 {  //class

	public static void main(String[] args) {  //main
		//인스턴스 배열: 각각의 인스턴스를 저장하는 배열
		//인스턴스의 배열은 각요소에 인스턴스의 참조값을 저장한다.
		String[] list= {"cha","kim","park"};
		//Scanner sc=new Scanner(System.in);
		String temp;
		temp=list[0];
		list[0]=list[list.length-1];
		list[list.length-1]=temp;
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);

		}
//		for(int i=0; i<list.length; i++) { //for문 1
//			System.out.print(i+1+"번째 입력:");
//			list[i]=sc.next(); //문자열 입력시
//		}//End for문
//		for(int i=0; i<list.length; i++) { //for문 2
//			System.out.println(list[i]);	
		//End for문 
	}//End main
}//End class
