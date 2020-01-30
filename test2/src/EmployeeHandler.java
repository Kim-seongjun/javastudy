
public class EmployeeHandler {
	private Employee[] empList=new Employee[50];
	private int empNum=0;
    int total=0;
	public void addEmployee(Employee permanentWorker ) {
		empList[empNum]=permanentWorker;
		empNum++;
		
	}

	public void showAllSalaryInfo() {
		System.out.println("전체 직원 정보");
		for(int i=0;i<empNum;i++) {
			//다형성을 활용한 코드
			empList[i].showSalaryInfo();
		}
	}

	public void showTotalSalary() {
		
		for(int i=0;i<empNum;i++) {
			total=total+empList[i].getPay();
		
		}
		System.out.println("총합은="+total);
		
	}

}
