public class SalesWorker extends PermanentWorker {
	private int salesResult; // �� �ǸŽ���
	private double bonusRatio; // �󿩱� ����

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
		System.out.println("�����޿�: " + getPay());
	}
}
