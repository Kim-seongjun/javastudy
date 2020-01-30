package bean;

public class NewsWriter {
	NewsPaper paper;

	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}

	public void run() {
		paper.setTodayNews("자바의 열기가뜨겁습니다.");

	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}
