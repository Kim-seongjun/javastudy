
public class Circle {
    private point center;
    private double redius;
    //������, �޼ҵ� ����
	public Circle(int x, int y, double r) {
		this.radius=r;
		center=new point(x,y);
		
		
		
	}
	public void showCircleInfo() {
		System.out.println("������="+radius);
		center.showPointInfo();
	}

}
