
public class Ex2 {
	
	
	
	public static void chekNumberBig (int len ,int arr[]) {
		 int newLen =len-1;
		if (newLen == 0)
			return ;
		if (arr [newLen] > arr[len] && arr[newLen ] > arr[newLen-1])
			System.out.println(arr[newLen]);
		
		chekNumberBig(len-1 ,arr);	
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,20,8,5,1,2,1,8,9,2,6,2};
			
			chekNumberBig(11 ,arr);
	}

}
