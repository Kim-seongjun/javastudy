package main;

import java.util.Scanner;

import been.AgeInputException;

public class Ex4 {

	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		try {
			int age = readAge(); // 3.throws에 의해 이동된 예외처리 포인트
			System.out.println("당신은 " + age + "세입니다.");
		} catch (AgeInputException e) // 4.예외 처리 코드
		{   e.printStackTrace();
			System.out.println(e.getMessage()); // e.printStackTrace(); 변경해 볼것.
		}
	}

	public static int readAge() throws AgeInputException //2.AgeInputException는 던져버린다
	{
	Scanner keyboard=new Scanner(System.in);
	int age=keyboard.nextInt();
	if(age<0){
	AgeInputException excpt=new AgeInputException();
	throw excpt; //1.예외가 발생한 지점 명시.
	}
	return age;

}
}
