package test;

public class Hello {
	public static void main(String[] args) {
		double num1, num2, result;
		num1=1.0000001;
		num2=2.0000001;
		result=num1+num2;
		System.out.println("result="+result);
		long val=10000000000L; //���
		System.out.println("val="+val);
		//����
		//int���� long������ �ٲ��� ���� �ذ��� ��....
		long a = 1000000L; // 1�鸸
		long b = 2000000L; // 2�鸸
		long c = a * b;  // 2  ��
		System.out.println(c); // 2  ��
		
		/*long d = 1000000 * 2000000; // 2 ��
		System.out.println(d); // 2 ��
		
		int e = 1000000 * 1000000 / 1000000; // 1�鸸
		System.out.println(e); //1�鸸
			*/	
		
	}//main�޼ҵ� ��

}//Hello End
