
public class Ex4 {
	public static int sumOfDivision (int len ,int arr []) {
		if (len < 0)
			return 0;	
		if (arr[len] % 10 == 0)
			return arr[len]+sumOfDivision(len-1 ,arr);
		return 0+sumOfDivision(len-1 ,arr); 
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		int arr [] = {10,20,25,30,15,40};
		
		System.out.println(sumOfDivision(5 ,arr));

	}

}
