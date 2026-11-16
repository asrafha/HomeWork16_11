
public class Ex6 {
	
	public static boolean chekNumbersNear (int len ,int arr[] ,int numA ,int numB) {
		if (len != 0) {
			
			if (arr[len] == numA ) {
				if (arr[len-1] == numB)
					return true ;
			}else {
				if (arr[len]==numB)
					if (arr[len-1]==numA)
						return true;
			}
			
				return chekNumbersNear(len-1 ,arr ,numA ,numB);
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		int arr []= {10,20,30,40,50,60,70,80};
		
		
		
		System.out.println(chekNumbersNear(7 ,arr ,10,10));

	}

}
