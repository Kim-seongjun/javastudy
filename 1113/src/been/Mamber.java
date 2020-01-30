package been;
//회원 정보를 저장할 빈(been)

public class Mamber {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String email;
	public String setName;
	public Mamber(String id, String pw, String name, int age, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public Mamber() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void showInfo() {
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("email:"+email);
		System.out.println("=============");
		
	}
	
	
	

}
