package main;

//student Ŭ������ Person Ŭ������ ����Ѵ�.
//Person(����,����,����)Ŭ���� <---- Student(�ļ�,����,����)Ŭ����
public class Student extends Person {
	// �̸�, ����, ���ڱ�
	private int sNo;
	private int kor;

	public Student() {
		System.out.println("Student call()");
		sNo = 1;
		kor = 0;
	}

	public Student(String name, int age, int sNo, int kor) {
//     ��Ӻ��� ���������� �켱
//	   this.name=name;
//	   this.age=age;
		super(name, age); // persor();
		this.sNo = sNo;
		this.kor = kor;
		System.out.println("Student(4��)");
	}
	public void sleep() {
		System.out.println("�л��� 6�ð� �ܴ�.");
	}

	public void study() {
		System.out.println("�л��� ���θ� �Ѵ�.");

	}

	public void showStudentInfo() { //�޼ҵ� �������̵�(������)
		showPersonInfo();
		System.out.println("sNo=" + sNo);
		System.out.println("kor=" + kor);
	}

}
