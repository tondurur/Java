package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseTheStringWords {
	public static void main(String[] args) {
		
	String str = "My Name Is Ravi";
	String [] s = str.split(" ");
	Collections.reverse(Arrays.asList(s));
	
	System.out.println(String.join(" ", s));
	
	
	
	}
	

}
