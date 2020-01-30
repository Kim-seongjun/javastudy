package main;

class ShowThread extends Thread {
	String threadName;

	public ShowThread(String name) {
		threadName = name;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("안녕하세요. " + threadName + "입니다.");
			try {
				sleep(100); // 1/1000 초 단위로 실행흐름을 일시적으로 멈춘다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
