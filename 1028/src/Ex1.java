
public class Ex1 {

	public static void main(String[] args) {
		int avg=78;
		String grade=null; // ""����
		grade="����� ������";
		if(avg>=90 && avg<=100) {
			grade+="A����";
		}else if(avg>=80) {
			grade+="B����";
		}else if(avg>=70) {
			grade+="C����";
		}else if(avg>=60) {
			grade+="D����";
		}else if(avg>=50) {
			grade+="F����";
		}
		System.out.println(grade);

	}

}
