package main;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	InputStream is;
	OutputStream os;
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Scanner sc;
	String rMsg;

	public void start() {
		while(true) {
		try {
			socket = new Socket("192.168.0.54", 7007); // localhost에 IP를 입력한다.
			sendMessage(socket);
			receiveMessage(socket);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	}
	private void receiveMessage(Socket socket) {
		// TODO Auto-generated method stub
		try {
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			rMsg = (String) ois.readObject();
			System.out.println(rMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void sendMessage(Socket socket) {
		// TODO Auto-generated method stub
		try {
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			sc = new Scanner(System.in);
			System.out.print("보낼 메시지 : ");
			String sMsg = sc.next();
			oos.writeObject(sMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Socket 통신 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCPClient tcpClient = new TCPClient();
		tcpClient.start();
	}
}
