public class Ex1 {
	//�ν��Ͻ� ����(�ʵ�)
	//int val=0;
	//Ŭ���� �޼ҵ�: �ν��Ͻ��� ������� �� ����
	public static void main(String[] args) {
		/*Card.width=5;
		Card.hieght=10;
		
		Card.classMethod();
		
		Card c1=new Card();
		Card c2=new Card();
		
		c1.number=3;
		c1.shape="diamond";
		
		c2.number=6;
		c2.shape="spade";
		
		c1.showCard();
		c2.showCard();*/
		
//		String name="cha";     //local(��������)
//		int age=30;
//		showMyinfo(name, age);
//		name="kim";
//		age=40;
//		showMyinfo(name, age);
//		write(300);  //����, �Ķ����
//		write(100);
//		write(500);
		//int result=adder(10,20);
		//System.out.println("result="+result);
		System.out.println("���:"+adder(10,20));
		System.out.println("���:"+adder(101,20));

	}  //�Ű������� ����������
	private static int adder(int num1, int num2) {
		int result=num1+num2;  //����
		return result; //return<--�޼ҵ带 ����
	}
	private static void showMyinfo(String name, int age) {
		System.out.println("----------");
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("----------");
		return; //<<�޼ҵ�����
	}
	private static void write(int num) {
		System.out.println(num);
		System.out.println("--------------");
	}
}
