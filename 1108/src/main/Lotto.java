package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		   Lotto lotto = new Lotto();

	        Scanner sc = new Scanner(System.in);
            System.out.print("로또번호 추출 개수 입력: ");

	        int game = sc.nextInt();
	        for (int i = 1; i <= game; i++) {

	        System.out.println(

	         i + "번째 로또번호: " + lotto.lottoNumbers());

	        }

	    }

	 

	    String lottoNumbers() {
	    	ArrayList<Integer> lottoNum = new ArrayList<Integer>();
            for (int i = 1; i <= 45; i++) {
            	lottoNum.add(i);

	        }

	        Collections.shuffle(lottoNum);

	 

	        int[] lottoNums = new int[6];

	        for (int i = 0; i < 6; i++) {

	            lottoNums[i] = lottoNum.get(i);

	        }

	          Arrays.sort(lottoNums);
              return Arrays.toString(lottoNums);


	
	}

}
