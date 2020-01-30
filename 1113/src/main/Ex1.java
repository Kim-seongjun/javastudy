package main;

import java.io.File;

public class Ex1 {
	public static void main(String[] args)
	{
	File myFile=new File("C:\\MyJava\\my.bin");
	if(myFile.exists()==false)
	{
	System.out.println("원본 파일이 준비되어 있지 않습니다.");
	return;
	}
	File reDir=new File("C:\\YourJava"); //Dir를 생성하기 위해 파일정보 제외.
	reDir.mkdir();
	File reFile=new File(reDir, "my.bin"); //기존 File 인스턴스에 디렉터리 이름이나 파일
	//이름을 추가하여 새로운 File 인스턴스를 생성할 수도 있다.
	myFile.renameTo(reFile);

}
}
