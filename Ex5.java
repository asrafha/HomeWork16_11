
public class Ex5 {
	
	public static void chekNumbers (int len ,int arr[]) {
		 if (len == 1)
			 return ;
		 if (arr[len] >=0 && arr[len-2] < 0)
			 System.out.println(arr[len-1]);
		 chekNumbers(len-1 ,arr);
		
	}

	public static void main(String[] args) {
		int arr []  = {-10 ,20 ,30 ,-40,50,60,70 ,-90,5,85};
		
		chekNumbers(9 ,arr);

	}

}
