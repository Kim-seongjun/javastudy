package test;

public class Mon {
 	// ���� �̸�, ü��, ����, ���ݷ�, ����
   // String[] 3   String[] a = new String[3]; //0 ���丮 1 �� 2 �����
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
	