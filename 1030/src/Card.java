public class Card {
	static int width;
	static int hieght;
	int number;
	String shape;
	
	void showCard() {
		System.out.println("w="+width);
		System.out.println("h="+hieght);
		System.out.println("num="+number);
		System.out.println("shape="+shape);
		System.out.println("=====================================");
	}
	static void classMethod() {
		System.out.println("�÷��� ����");
		System.out.println("ī��ũ��");
		System.out.println("w="+width);
		System.out.println("h="+hieght);
	}
}
