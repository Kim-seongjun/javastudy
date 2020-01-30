
public class Ex1 {

	public static void main(String[] args) {
		int avg=78;
		String grade=null; // ""공백
		grade="당신의 점수는";
		if(avg>=90 && avg<=100) {
			grade+="A학점";
		}else if(avg>=80) {
			grade+="B학점";
		}else if(avg>=70) {
			grade+="C학점";
		}else if(avg>=60) {
			grade+="D학점";
		}else if(avg>=50) {
			grade+="F학점";
		}
		System.out.println(grade);

	}

}
