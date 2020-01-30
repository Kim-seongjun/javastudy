public class SalesWorker extends PermanentWorker {
	private int salesResult; // 월 판매실적
	private double bonusRatio; // 상여금 비율

	public SalesWorker(String name, int money, double ratio) {
		super(name, money);
		salesResult = 0;
		bonusRatio = ratio;
	}

	public void addSalesResult(int value) {
		salesResult += value;
	}

	public int getPay()
	{
		return (int) (super.getPay()+(salesResult*bonusRatio));
	}

	public void showSalaryInfo() {
		showYourName();
		System.out.println("영업급여: " + getPay());
	}
}
