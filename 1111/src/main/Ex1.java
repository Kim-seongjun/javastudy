package main;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------");
		//삭제
		list.remove(1);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
