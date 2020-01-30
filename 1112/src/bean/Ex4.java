package bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("Wildlife.wmv"); // 자바소스와 같은 폴더에 만들것.
		OutputStream out = new FileOutputStream("wildcpy.wmv"); // 자동으로 생성된다.
		int copyByte = 0;
		int readLen;
		byte buf[]=new byte[1024];
		long start=System.currentTimeMillis();
		while(true) {
			readLen=in.read(buf);
			if(readLen==-1)
				break;
			out.write(buf,0,readLen);
			copyByte+=readLen;
		}
		in.close();
		out.close();
		long end = System.currentTimeMillis();
		System.out.println("복사된 바이트 크기 " + copyByte);
		System.out.println("복사시간:" + (end - start) / 1000.0 + "초");

	}

}
