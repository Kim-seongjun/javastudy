package phone;

public class MenuChoiecException extends Exception {
	
	public MenuChoiecException(int menuNum) {
		super(menuNum+"몇번을 입력하셨습니까.");
	}

}
