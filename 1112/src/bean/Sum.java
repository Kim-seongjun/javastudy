package bean;

public class Sum {
	int num;
	
	public Sum() {
		num=0;
	}
	public void addNum(int n) {
		synchronized(this) {
			num+= n;
		}

	}
      public int getNum() {
    	  return num;
      }
}
