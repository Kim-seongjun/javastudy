//�ڵ�����ȯ
/*"a"+100->"a"+"100"->"a100"
 byte>short>int>long>float>double  ����<�Ǽ�
		char>int*/
//��������ȭ(casting)
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
		
		
		
		
//		char ch='A'; //�����ڵ�ǥ(������ ���� ���ڷ� ����)
//		char ch2=(char)(ch+32);
//		System.out.println("ch2="+ch2);
		
		
		
		
		
	}
}
