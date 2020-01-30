package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex2 {

	public class URLTest {
		public void main(String[] args) {
			InputStream is = null;
			InputStreamReader isr = null;
			BufferedReader br = null;
			try {
				URL url = new URL("http://www.hyejiwon.co.kr");
				is = url.openStream();
				isr = new InputStreamReader(is, "UTF-8");
				br = new BufferedReader(isr); // URL 코드를 한줄씩 읽기 위해
				String str = "";
				while ((str = br.readLine()) != null) {
					System.out.println(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					is.close();
					isr.close();
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
