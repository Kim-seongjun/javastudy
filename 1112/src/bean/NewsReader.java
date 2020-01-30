package bean;

public class NewsReader {
	NewsPaper paper;

	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}

	public void run() {
		System.out.println("오늘의 뉴스: " + paper.getTodayNews());

	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}
