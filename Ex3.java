
public class Ex3 {
	
	public static boolean division (int len ,int arr[]) {
		
		if (len < 1)
			return false;
		if (  (arr[len] + arr[len-1])%10 ==0)
			return true ;

		return division(len-1 ,arr);
		
		
	}

	public static void main(String[] args) {
		int arr []= {11,20,10,30,24,41,54,90,89};
		
		System.out.println(division(5 ,arr));

	}

}
