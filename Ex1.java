
public class Ex1 {
	
	public static int sumOfNumbers (int len ,int arr[]) {
		if (len < 0)
			return 0;
		else if (arr[len]%2!=0)
			return sumOfNumbers(len-1 ,arr);
		return arr[len] +sumOfNumbers(len-1 ,arr);
		
	}

	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,6};
		
		System.out.println(sumOfNumbers(5 ,arr));

	}

}
