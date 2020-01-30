package main;

import java.math.BigDecimal;
import java.util.Scanner;

public class NoErrorBigDecimal {

	public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("첫번째 수:");
         BigDecimal e1= new BigDecimal(sc.next());
         System.out.print("두번째 수:");
         BigDecimal e2= new BigDecimal(sc.next());
         
        
        
         System.out.println("절대값:"+e1.subtract(e2).abs());
         
        
	}

}
