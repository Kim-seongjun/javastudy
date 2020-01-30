public class Ex1 {
	//인스턴스 변수(필드)
	//int val=0;
	//클래스 메소드: 인스턴스와 상관없는 일 수행
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
		
//		String name="cha";     //local(지역변수)
//		int age=30;
//		showMyinfo(name, age);
//		name="kim";
//		age=40;
//		showMyinfo(name, age);
//		write(300);  //인자, 파라미터
//		write(100);
//		write(500);
		//int result=adder(10,20);
		//System.out.println("result="+result);
		System.out.println("결과:"+adder(10,20));
		System.out.println("결과:"+adder(101,20));

	}  //매개변수도 지역변수다
	private static int adder(int num1, int num2) {
		int result=num1+num2;  //복잡
		return result; //return<--메소드를 종료
	}
	private static void showMyinfo(String name, int age) {
		System.out.println("----------");
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("----------");
		return; //<<메소드종료
	}
	private static void write(int num) {
		System.out.println(num);
		System.out.println("--------------");
	}
}
