package test;

public class Mon {
 	// 몬스터 이름, 체력, 마력, 공격력, 방어력
   // String[] 3   String[] a = new String[3]; //0 도토리 1 귤 2 음료수
	String name;
    int HP;
    int MP;
    int AT;
    int S;
	String[] invn= new String[3]; 

	  public Mon(String name, int HP, int MP, int AT, int S) {
			this.name=name;
			this.HP=HP;
			this.MP=MP;
			this.AT=AT;
			this.S=S;
			
	}

	public Mon() {
		
	}
	
	void showInfo() {
		System.out.println(this.name+this.HP+this.MP);
		
	}
	void showInfo(int d) {
		System.out.println(d+this.name+this.HP+this.MP);
	}
	
}
	