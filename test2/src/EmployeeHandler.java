
public class EmployeeHandler {
	private Employee[] empList=new Employee[50];
	private int empNum=0;
    int total=0;
	public void addEmployee(Employee permanentWorker ) {
		empList[empNum]=permanentWorker;
		empNum++;
		
	}

	public void showAllSalaryInfo() {
		System.out.println("��ü ���� ����");
		for(int i=0;i<empNum;i++) {
			//�������� Ȱ���� �ڵ�
			empList[i].showSalaryInfo();
		}
	}

	public void showTotalSalary() {
		
		for(int i=0;i<empNum;i++) {
			total=total+empList[i].getPay();
		
		}
		System.out.println("������="+total);
		
	}

}
