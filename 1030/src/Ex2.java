class Data {
	int x;
}

public class Ex2 {
	public static void main(String[] args) {
		  Data d = new Data();
		  d.x = 10;
		  System.out.println("main():x=" + d.x);
		  change2(d);
		  System.out.println("main():x="+ d.x);
	}

	private static void change2(Data d) {
		d.x = 1000;
		System.out.println("change2: d.x="+d.x);
		
	}
	//static int change(int x, int y, int z) {
	//x = 1000;
	//System.out.println("change():x=" + x);
	//return = x
	//}
}