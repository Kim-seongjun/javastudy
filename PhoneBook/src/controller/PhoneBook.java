package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBookManager manager=new PhoneBookManager(); 
		
		
		int menuNum;
		while(true) {
			try {
				
			showMenu();
			menuNum=sc.nextInt();
			if(menuNum<Choice.INPUT||menuNum>Choice.EXIT)
				throw new MenuChoiecException(menuNum);
			
			switch(menuNum) {
			case Choice.INPUT: 
				manager.inputData();
				break;
			case Choice.SEARCH:
				manager.searchData();
				break;
			case Choice.DEL:
				manager.deleteData();
				break;
			case Choice.SHOWALL:
				manager.showAllData();
			case Choice.EXIT:	
				System.out.println("프로그램 종료");
				return;
				//System.exit(1);
			default:	
			}
		} catch(MenuChoiecException e) {
			
			
			System.out.println("메뉴 선택을 다시 합니다.");
		}catch(InputMismatchException e) {
			e.printStackTrace();
			
			System.out.println("메뉴는 정수로 입력하세요.");
			sc.nextLine();
		}
		}
		
	}
	
	private static void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("-------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.전체 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("-------------");
		System.out.print("선택:");
	}

}


