
public class Ex2 {

	public static void main(String[] args) {
    //����>����(���>����>��)>����>����
	//�� ������: !(1����) &&(2����) ||(3����) 
//	int a=10;
//	boolean b;
//	b=a>20 && ++a>5;
//	System.out.println("a="+a+",b="+b);
//	
//	b=a>0 || ++a>5;
//	System.out.println("a="+a+",b="+b);
//	
//	//����(2/29)
//	//4�� ����⵵
//	//100�� ����⵵ ����
//	//400����⵵ ����
//	int year=2000;
//	//if.....
//	
//	System.out.println("����");
	String n="b";
	String product="";
	//if(n.contentEquals("B") || n.contentEquals("b"){}
	switch(n) {     //�Ǽ��� ����
	case "C": case "c":
		product+="����,";
		break;
	case "B": case "b":
		product+="�Ķ�����,";
		break;
	case "A": case "a":
		product+="���ڷ���,";
		break;
	default:
		product+="������,";
	

	}System.out.println("��ǰ��"+product);
	
	
	}

}
