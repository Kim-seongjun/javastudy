package bean;

public class InputException extends Exception{
	
	public InputException(String a) {
		super(a);
		if(a.equals("main")) {
			System.out.println("1-5만 입력하세요");
		}
	}
}
