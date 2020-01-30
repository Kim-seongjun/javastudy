public class TemporaryWorker extends Employee // �ӽ���
{
	private int workTime = 0; // �ٹ��� �ð�
	private int payPerHour; // �ð� �޿�

	public TemporaryWorker(String name, int pay) {
		super(name);
		payPerHour = pay;
	}

	public void addWorkTime(int time) {
		workTime += time;
	}

	public int getPay() {
		return workTime * payPerHour;
	}

	public void showSalaryInfo() {
		showYourName();
		System.out.println("�����Ա޿�: " + getPay());
	}
}
