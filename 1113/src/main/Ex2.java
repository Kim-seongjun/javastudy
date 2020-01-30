package main;

import java.util.List;

import been.Mamber;

public class Ex2 {

	public static void main(String[] args) {
		LoginSVC login=new LoginSVC();
		List<Mamber> mList=null;
		LoginSVC ct=new LoginSVC();
		ct.connect();
		mList=ct.getMamber();
		if(mList!=null) {
		for(int i=0;i<mList.size();i++) {
			mList.get(i).showInfo();
			
		}
		login.close();
		
		
		//ct.connect(); //connect(;>select>close
//		Mamber mb=ct.login("CCC", "1111");
//		if(mb!=null) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		//ct.select();	
       // ct.insert();
		//ct.select();
//		ct.update();
//		ct.select();
//	    ct.delete();
//		ct.select();
		
		ct.close();
		

	}

}
}
