//�ݺ���: while, do~while, for
public class Ex3 {
	public static void main(String[] args) {
//		int num=0;
//		while(num<5) {
//			System.out.println("num="+num);
//			num++;
//		}
//
//		System.out.println("������ num="+num);
	//}
	//1~10������ ���� while������ ���ؼ� 55�� ���
	   int num=0;
	   int sum=0;
	   while(num<10) {
		   sum+=++num;
	   }
		     System.out.println("num="+sum);
	//���� ������ �Է¹޾Ƽ� �ش� �������� ���
	int dan=5;
	//while���� �̿��ؼ� ���������
	//5 * 1 = 5
	//5 * 2 = 10
	//5 * 3 = 15
	//5 * 4 = 20
	//5 * 5 = 25
	//5 * 6 = 30
	//5 * 7 = 35
	//5 * 8 = 40
	//5 * 9 = 45
	int n1=0;
	while(n1<9) {
		++n1;
	System.out.println(dan+"*"+n1+"="+(dan*n1));
	}         
	}

}
