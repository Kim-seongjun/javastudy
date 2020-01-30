package been;

public class Student {
	//필드(멤버 변수)
    public static final String SCNAME="ICIA교육원";
    
    private Person p; //인스턴스 변수
    private int sno; //인스턴스 변수
    private int kor;//인스턴스 변수
    
    public Student(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public void study() {
    	System.out.println("공부를 한다.");
    	exam();
    	
    }
    private void exam() {
    	System.out.println("시험도 본다.");
    }
    //클래스 메소드: 인승턴스 생성(상관없이)없는 일을 수행
   public static void showTitle() {
        System.out.println("---------");
    	System.out.println(SCNAME);
    	System.out.println("화이팅");
    	System.out.println("---------");
    }
public void showInfo(String name, int age, int sno, int kor) {
	p=new Person(name, age);
	this.sno=sno;
	this.kor=kor;
	
	
}
public void showInfo() {
	// TODO Auto-generated method stub
	
}
    
}
