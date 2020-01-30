//자동형변환
/*"a"+100->"a"+"100"->"a100"
 byte>short>int>long>float>double  정수<실수
		char>int*/
//강제형변화(casting)
public class Ex2 {
	public static void main(String[] args) {
		int kor,eng,tot;
		int cnt=2;
		kor=70; eng=71;
		tot=kor+eng;
		
		double avg=tot/(double)cnt;
		System.out.println("tot="+tot);
		System.out.println("ave="+avg); //70.5
		
		double pi=3.1415;
		int pi2=(int)pi;
		System.out.println("pi="+pi);
		System.out.println("pi="+pi2);
		
		byte a=10; //1Byte
		byte b=20;
		byte c=(byte)(a+b);
		System.out.println("c="+c);
		
		
		
		
//		char ch='A'; //유니코드표(전세계 문자 숫자로 저장)
//		char ch2=(char)(ch+32);
//		System.out.println("ch2="+ch2);
		
		
		
		
		
	}
}
