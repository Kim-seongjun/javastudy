package operator;

public class Ex3 {

	public static void main(String[] args) {
		//����(����) ������
		int a=10, b=20;
		int max=0;
//		if(a>b) {
//			max=a;
//		}
//		if(a<=b) {
//			max=b;
//		}
//		max=(a>b)?a:b;
//		System.out.println("ū����"+max);
		String result;
//		result=(a>b)?("a�� ũ��"):("ab���ų� b�� ũ��");
//		System.out.println("result="+result);
		
		int num1=10, num2=30, num3=20;
		//���׿����ڸ� �̿��ؼ� �� ������ ���� ū ���ڸ� ���Ͻÿ�.
//		result=(num1<num2)?("num2��ũ��"):("num1�� ũ�ų�����.");
//		result=(num2>num3)?("num2�� ũ��"):("num3�� ũ�ų� ����");
//		System.out.println("result="+result);
		//max=(num1>num2) ? (num1>num3) ? num1:num3 
			//	        : (num2>num3) ? num2:num3;
		if(num1>num2) {
			max=(num1>num3) ? num1:num3;
		}
		if(num1<=num2) {
			max=(num2>num3)?num2:num3;
		}
		System.out.println("����ū����"+max);
		
	}
}

