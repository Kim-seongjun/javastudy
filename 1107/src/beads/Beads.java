package beads;

public class Beads {

	public static void main(String[] args) {
		ChildBeads child1=new ChildBeads(15);
		ChildBeads child2=new ChildBeads(9);
		
		child1.obtainBead(child2,2);
		child1.showBeadsNum();
		child2.showBeadsNum();

		
		child2.obtainBead(child1,10);
		child1.showBeadsNum();
		child2.showBeadsNum();
		
		child2.obtainBead(child1,10);
		
		child1.showBeadsNum();
		child2.showBeadsNum();

	}

}
