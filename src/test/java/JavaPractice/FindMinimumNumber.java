package JavaPractice;

public class FindMinimumNumber {
	public static void main(String[] args) {
		
		int arr[] = {34,45,23,12};
		int Min = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<Min) {
				Min=arr[i];
			}
		}
		System.out.println(Min);
		
		
		
		
		
		
	}

}
