//좌표 
public class Point {
   
   //private만 붙히면 정보은닉
   private int xPos; //(0~100)
   private int yPos; //(0~100)
   
   void input( ) {
	   xPos+=10;
	   yPos+=10;
   }

public void setX(int x) {
	if(x<0 || x>100)
		return;
	xPos=x;
	
}
public void setY(int y) {
	if(y<0 || y>100)
		return;
	yPos=y;

}

public void showPointInfo() {
	System.out.println("xPos="+xPos); 
	
}
}

