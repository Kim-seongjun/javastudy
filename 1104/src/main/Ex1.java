package main;

import bean.Friend;

public class Ex1 {

	public static void main(String[] args) {
		Friend f1 = new Friend("°©¼øÀÌ");
		Friend f2 = new Friend();
//		String name=f1.toString();
		System.out.println(f1);
		f2.showInfo();
//		System.out.println(name);
		System.out.println(f2);
		System.out.println("°­¾ÆÁö°¡ ¸Û¸Û Â¢´Â´Ù.");
		
	
//		int dan=5;
//		for(int i=1;i<10;i++) {
//			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
////			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
//		}
    }

}
