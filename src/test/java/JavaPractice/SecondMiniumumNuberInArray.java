package JavaPractice;

import java.util.Arrays;

public class SecondMiniumumNuberInArray {

	public static int getsecondLowestNumber (int []n, int Total) {
		Arrays.sort(n);
		return n[1];
		

	}
public static void main(String[] args) {
	int [] arr = {2,3,4,5,6,7};
	int n = 6;
	System.out.println(getsecondLowestNumber(arr, n));
}
}
