package JavaPractice;

public class FindMaxNumber {
	public static void main(String[] args) {
		
		
		int [] arr = {23,34,45,65};
		int Max = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>Max) {
				Max=arr[i];
				
				
			}
		}
		System.out.println(Max);
		
		
		
	}

}
