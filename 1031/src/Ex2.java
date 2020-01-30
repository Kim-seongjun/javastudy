
public class Ex2 {

	public static void main(String[] args) {
		//메소드 오버로딩 으로 해결
		System.out.println("박스부피:"+boxv(1));//1
		System.out.println("박스부피:"+boxv(1,2));//2
		System.out.println("박스부피:"+boxv(1,2,3));//6
	}

	private static int boxv(int w, int l, int h) {
		return w*l*h;
		
	}

	private static int boxv(int w, int l) {
		return w*l*1;
		
	}

	private static int boxv(int w) {
		
		return w*1*1;
		
	}

}
