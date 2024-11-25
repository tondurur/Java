package JavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.tools.Tool;

public class FindSecondLargestNumberInArray2 {

	public static int getSeconlargestNumber (int []n, int Total) {
		
		Arrays.sort(n);
		return n[Total-2];
	}
	public static void main(String[] args) {
		
		int [] n = {2,5,7,3};
		
		System.out.println(getSeconlargestNumber(n, 4));
	}
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	











