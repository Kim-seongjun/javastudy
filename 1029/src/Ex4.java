public class Ex4 {
	public static void main(String[] args) {
		int[][] arr = {{1,2},
					   {1,2,3},
					   {1,2,3,4,5,}
		};
		System.out.println("배열의 행길이:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"행길이="+arr[i].length);
		}
		int row=3;
		int[][] arr2=new int[row][]; //열의 길이는 미정
		int col1=3;
		arr2[0]=new int[col1];
		int col2=5;
		arr2[1]=new int[col2];
		int col3=2;
		arr2[2]=new int[col3];
		
		
	}//End main
}//End class