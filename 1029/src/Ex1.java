//Array:�迭 (�߿�)
//new ���� : �ν��Ͻ�
public class Ex1 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		//arr:�������� new int:�迭(�ν��Ͻ�)
		int total=0;
		for(int i=0;i<arr.length;i++)
			total+=arr[i];
		
		System.out.println("����="+total);
		System.out.println("���="+(double)total/arr.length);
//		total+=arr[0];
		//�ݺ������� �ٲٰ� ����� �Ҽ������ϱ��� ���
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]); //�ݺ���
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
	}

}
