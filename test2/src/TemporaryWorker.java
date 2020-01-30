public class TemporaryWorker extends Employee // 임시직
{
	private int workTime = 0; // 근무한 시간
	private int payPerHour; // 시간 급여

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
		System.out.println("비정규급여: " + getPay());
	}
}
