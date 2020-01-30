
public class Ex3 {

	public static void main(String[] args) {
		String name="cha ji hun";
		if(name.startsWith("cha"))
			System.out.println("ture");
		String pId="880909-5657844";
		StringBuilder sb=new StringBuilder(pId);
		
//		int idx=sb.indexOf( '-');
//		if(idx!=-1)
//		   sb.deleteCharAt(idx);
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)=='-') {
				sb.deleteCharAt(i);
				break;
			}
		}
		pId=sb.toString();
		System.out.println("pId="+pId);
	}

}
