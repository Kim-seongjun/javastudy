package bean;

public class Friend {
	private String name;
	private int age;
	private double height;

	public Friend() {
		this.name = "noname";
		this.age = 20;
		height=160.5;

	}

	public Friend(String name) {
		this.name = name;
		this.age=20;
		this.height=180.5;
	}
	public void showInfo() {
		System.out.printf("나이=%d\t이름=%s,신장=%.2f\n",age,name,height);
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("");
		sb.append("내 친구 이름은 " + name + " 입니다.\n");
		sb.append("친구 나이는 " + age + "세 입니다.\n");
//		String str = "";
//		str += "내 친구 이름은 " + name + " 입니다.\n";
//		str += "친구 나이는 " + age + "세 입니다.\n";
//		str += "===============";
		return sb.toString();
	}

}
