package main;

//student 클래스가 Person 클래스를 상속한다.
//Person(조상,상위,슈퍼)클래스 <---- Student(후손,하위,서브)클래스
public class Student extends Person {
	// 이름, 나이, 잠자기
	private int sNo;
	private int kor;

	public Student() {
		System.out.println("Student call()");
		sNo = 1;
		kor = 0;
	}

	public Student(String name, int age, int sNo, int kor) {
//     상속보다 정보은닉이 우선
//	   this.name=name;
//	   this.age=age;
		super(name, age); // persor();
		this.sNo = sNo;
		this.kor = kor;
		System.out.println("Student(4개)");
	}
	public void sleep() {
		System.out.println("학생은 6시간 잔다.");
	}

	public void study() {
		System.out.println("학생은 공부를 한다.");

	}

	public void showStudentInfo() { //메소드 오버라이딩(재정의)
		showPersonInfo();
		System.out.println("sNo=" + sNo);
		System.out.println("kor=" + kor);
	}

}
