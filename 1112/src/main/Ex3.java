package main;

import bean.NewsPaper;
import bean.NewsReader;
import bean.NewsWriter;

public class Ex3 {

	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsReader reader = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		reader.start();
		writer.start();
		reader.join();
		writer.join();
	}
}