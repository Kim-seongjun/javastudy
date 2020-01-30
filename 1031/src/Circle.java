
public class Circle {
    private point center;
    private double redius;
    //생성자, 메소드 정의
	public Circle(int x, int y, double r) {
		this.radius=r;
		center=new point(x,y);
		
		
		
	}
	public void showCircleInfo() {
		System.out.println("반지름="+radius);
		center.showPointInfo();
	}

}
