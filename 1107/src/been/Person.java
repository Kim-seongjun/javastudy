package been;

public class Person {
   private String name;
   private int age;
   
   public Person(String name, int age) {
	this.name=name;
	this.age=age;
}
   
   @Override
public String toString() {
	
	return super.toString();
}

void sleep( ) {
	   System.out.println("사람은 8시간 잔다.");
   }
   void eat() {
	   System.out.println("3끼를 먹습니다.");
   }
}
