package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		        //key   //value
		HashMap<String,Object>hMap;
		hMap=new HashMap<String,Object>();
		
		hMap.put("id","surecha" );
		hMap.put("pw","1111" );
		hMap.put("name","cha" );
		hMap.put("age",30 );
		
		HashMap<String,Object>hMap2;
		hMap2=new HashMap<String,Object>();
		hMap2.put("id","abc" );
		hMap2.put("pw","1112" );
		hMap2.put("name","dqe" );
		hMap2.put("age",30 );
		
		ArrayList<HashMap<String,Object>>list;
		list=new ArrayList<HashMap<String,Object>>();
		list.add(hMap);
		list.add(hMap2);
		Iterator<HashMap<String,Object>>itr=list.iterator();
		while(itr.hasNext()) {
			HashMap<String, Object>curMap=itr.next();
			System.out.println(curMap.get("id"));
			System.out.println(curMap.get("pw"));
			System.out.println(curMap.get("name"));
			System.out.println(curMap.get("age"));
		}
		
		
		Object id=hMap.get("id");
		Object pw=hMap.get("pw");
		Object name=hMap.get("name");
		Object age=hMap.get("age");
		System.out.println("id="+id);
		System.out.println("pw="+pw);
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		
		

	}

}
