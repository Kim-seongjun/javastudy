package main;

public class Ex1 {

	public static void main(String[] args) {

		  int money = 68550;
	        int m1=(money/10000);//만원권
	        int m2=(money%10000)/5000;//오천원권
	        int m3=(money%5000)/1000;//천원권
	        int m4=(money%1000)/500;//오백원권
	        int m5=(money%500)/100;//백원권
	        int m6=(money%100)/50;
	        System.out.println("금액 : "+money);
	        System.out.println("만원권: "+m1+", 오천원권: "+m2+", 천원권: "+
	        m3+", 오백원권: "+m4+", 백원권: "+m5+",오십원:"+m6);

		
	}

}
