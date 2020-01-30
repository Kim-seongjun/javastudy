package main;


import been.MyName;

public class Ex2 {
	class ObjectFinalize
	{
	public void main(String[] args){
	MyName obj1=new MyName("인스턴스1");
	MyName obj2=new MyName("인스턴스2");
	obj1=null;
	obj2=null;
	System.out.println("프로그램을 종료합니다.");
	System.gc();
	System.runFinalization();
	}
	}
}
