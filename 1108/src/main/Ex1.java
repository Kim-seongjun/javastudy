package main;

import been.Rectangle;

public class Ex1 {

	public static void main(String[] args) {
		{
			Rectangle rec1= new Rectangle(1, 2, 8, 9);
			Rectangle rec2= new Rectangle(2, 3, 5, 5);
			Rectangle rec3= new Rectangle(1, 2, 8, 9);
			if(rec1.equals(rec3))
			System.out.println("rec1과 rec2의 내용 정보는 같다.");
			else System.out.println("rec1과 rec2의 내용 정보는 다르다.");

	}

	}
}