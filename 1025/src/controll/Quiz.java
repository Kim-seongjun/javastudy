package controll;
public class Quiz {
	public static void main(String[] args) {
		//90�� �̻� : A����, 80�� �̻�: B����,
		//70�� �̻�: C���� �������� F�������� ó���ϵ��� �ۼ� �Ѵ�.
		int ave=90; //0~100���̸� ������
		//if��, if~else�� ������ ���
		//A�����Դϴ�.
		if(ave>=90) {
			System.out.println("A����");
		} else if(ave>=80) {
			System.out.println("B����");
		} else if(ave>=70) {
			System.out.println("C����");
		} else if(ave <70) {
			System.out.println("F����");
		}
	}
}
