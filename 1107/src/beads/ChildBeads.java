package beads;

public class ChildBeads {
	private int numBeads;// 구슬 개수

	public ChildBeads(int num) {
		numBeads = num;

	}

	public int loseBead(int i) {
		
		 
		if(numBeads<i) {
			numBeads=0;
			
		}else {
			numBeads=numBeads-i;
			 
		}
		return i;

	}

	public void obtainBead(ChildBeads child, int i) {
		int obtaIinNum=child.loseBead(i);
		this.numBeads+=obtaIinNum;
		
	}

	public void showBeadsNum() {
		System.out.println("보유중인 구슬 개수="+numBeads);
	}

}
