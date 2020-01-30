package main;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 점수는 사용자에게 입력받을 것이기 때문에
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);

		// 성적을 입력 받음.
		System.out.print("당신의 성적을 입력하세요 : ");

		int score = scan.nextInt();

		if (score <= 60) {
			System.out.println("C학점입니다.");
		} else if (score <= 80) {
			System.out.println("B학점입니다.");
		} else if (score <= 90) {
			System.out.println("A학점입니다.");

		}

	}

}
