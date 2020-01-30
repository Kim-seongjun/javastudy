package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
	    list.add(new Integer(10));
	    list.add(20);
		list.add(20);
		list.add(40);
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext()) {
				Integer curInt=itr.next();
				System.out.println(curInt);
				if(curInt.equals(30)) {
					itr.remove();
				
			}
		}
		System.out.println("---------");
		itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
