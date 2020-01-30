package bean;

public class NewsPaper {

	private String todayNews;
	boolean isTodayNews = false;

	public void setTodayNews(String news) {
		todayNews = news;
		isTodayNews = true;
		synchronized (this) {
			notifyAll();
		}
	}

	public String getTodayNews() {
		if (isTodayNews == false) {
			try {
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		return todayNews;
	}
}