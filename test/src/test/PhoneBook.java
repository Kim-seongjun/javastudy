package test;

import java.util.Scanner;

import controller.Choice;

public class PhoneBook {
	
public static Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) {
       int menuNum;
       PhoneBookManager manager=new PhoneBookManager();

       while(true) {
    	   showMenu();
    	   menuNum=sc.nextInt();
    	   switch(menuNum) {
    	   case Choice.INPUT:
    		  manager.inputData();
    		  break;
    	   case Choice.SEARCH:
    		   manager.searchData();
    		   break;
    	   case Choice.DEL:
    		   manager.deleteData1();
    		   break;
    	   case Choice.SHOWALL:
    		   manager.showallDatal();
    	   case Choice.EXIT:
    		   
    		   System.out.println("프로그램 종료");
    		   return;
    		
    		   
    	   }
       }
}//main End
	private static void readData() {
		System.out.print("이름:");
		String name= PhoneBook.sc.next();
		System.out.println("전화번호:");
		String phonenum=PhoneBook.sc.next();
		System.out.println("생년월일:");
		String birth=PhoneBook.sc.next();
		
		PhoneInfo info=new PhoneInfo(name,phonenum,birth);
		info.showPhoneInfo();//출력 메소드에 정의할 예정
		
		
	}
	private static void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("----------");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.종료");
		System.out.println("----------");
		System.out.print("선택:");
	}
}