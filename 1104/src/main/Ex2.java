package main;

import bean.PartTimeStd;

public class Ex2 {

	public static void main(String[] args) {
		Student std = new Student();

		Student std1 = new Student("kim", 20, 1111, 90);
		std1.showStudentInfo();
		std1.sleep();
		
		PartTimeStd pts= new PartTimeStd();
		pts.study();
		pts.work();
		pts.sleep();
		
		

	}

}
