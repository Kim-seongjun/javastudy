import java.util.Scanner;

public class Quiz1_1030 {

	public static void main(String[] args) {
		//1.
				operation(10,3);
				//----------------------------------
				System.out.println("----------------2----------------");
						//2.
				abs(10,3); //�μ��� ���� ���밪 :7
				abs(3,10);  //�μ��� ���� ���밪 :7
				System.out.println("----------------3----------------");
				//3.									//������
				System.out.println("�� �ѷ�: "+ cirRound(2.4));
				System.out.println("�� ����: "+ ciraREA(2.4));
				//�� �ѷ�: xxxx.xx (����*3.14)
				//�� ����: xxxx.xx (������*������*3.14)
				
				
				System.out.println("----------------4----------------");
				//4.
				for(int i=1;i<11;i++) {
					if(isEven(i)) {
					System.out.println(i+":¦��");
					}
				}
				System.out.println("----------------5----------------");
				//5.
				String name=inputName();
				System.out.println("----------------6----------------");
				showName(name);
	}	
	private static void showName(String name) {
		System.out.println("�Է��� �̸�="+name);
	}

	private static String inputName() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��Է� : ");
		String name=sc.next();
		return name;
	} 
	
	private static boolean isEven(int i) {
		if(i%2==0) {
			return true;
		}
		return false;
	}
	
	private static double ciraREA(double d) {
		double ciraREA=d*d*3.14;
		return ciraREA;
	}
	
	private static double cirRound(double d) {
		double cirRound=(d+d)*3.14;
		return cirRound;
	}
	
	private static void abs(int i, int j) {
		int result;
		if(i>j) result=i-j;
		else result=j-i;
		System.out.println("�μ��� ���� ���밪="+result);
		}
	
	private static void operation(int i, int j) {
		System.out.println("���� ��� :" + (i+j));
		System.out.println("���� ��� :" + (i-j));
		System.out.println("���� ��� :" + (i*j));
		System.out.println("�������� �� :" + (i/j));
		System.out.println("�������� ������ :" + (i%j));
		}
}