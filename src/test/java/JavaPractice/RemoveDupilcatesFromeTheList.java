package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDupilcatesFromeTheList {
	public static void main(String[] args) {
		
		
		List<Integer> al = new LinkedList<Integer>();
		
		al.add(2345);
		al.add(2345);
		al.add(2345);
		al.add(2335);
		al.add(2345);
		al.add(2365);
		al.add(2345);
		
		Set<Integer>  set = new HashSet<Integer>(al);
		List<Integer>  ls = new LinkedList<Integer>(set);
		System.out.println(ls);
}
}