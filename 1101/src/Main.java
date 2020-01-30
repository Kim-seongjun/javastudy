import javax.print.SimpleDoc;

public class Main {

	public static void main(String[] args) {
		Simple adder=new Simple();
		adder.adder(10).adder(20).adder(30);
		adder.adder(20);
		adder.showResult();
		

	}

}
