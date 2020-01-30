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
		System.out.printf("����=%d\t�̸�=%s,����=%.2f\n",age,name,height);
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("");
		sb.append("�� ģ�� �̸��� " + name + " �Դϴ�.\n");
		sb.append("ģ�� ���̴� " + age + "�� �Դϴ�.\n");
//		String str = "";
//		str += "�� ģ�� �̸��� " + name + " �Դϴ�.\n";
//		str += "ģ�� ���̴� " + age + "�� �Դϴ�.\n";
//		str += "===============";
		return sb.toString();
	}

}
