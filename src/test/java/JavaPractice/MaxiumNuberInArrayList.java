package JavaPractice;

public class MaxiumNuberInArrayList {

	public static void main(String[] args) {
		
		int [] arr = {2,4,67,89,90,1};
		
		int Max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>Max) {
				Max = arr[i];
				
			}
			
		}
		
		System.out.println(Max);
		
		
		
		
		
		
		
		
	}

}
