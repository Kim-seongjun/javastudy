package main;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		Random rand=new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i=0;i<10;i++) {
			System.out.println(rand.nextInt(45)+1);
		}
          int a=(int)(Math.random()*10);
	}

}
