
public class Simple {
	 
		
	private int num;
	
	

	public void showResult( ) {
		System.out.println("num="+num);
	}
	
	public Simple adder(int num) {
		this.num+=num;
		return this;

}

}