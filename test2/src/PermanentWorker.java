public class PermanentWorker extends Employee // ������
{
	private int salary; // ����

	public PermanentWorker(String name, int money) {
		super(name);
		salary = money;
	}

	public int getPay() {
		return salary*12;
	}

	public void showSalaryInfo() {
		showYourName();
		System.out.println("total:" + getPay());
	}
}
