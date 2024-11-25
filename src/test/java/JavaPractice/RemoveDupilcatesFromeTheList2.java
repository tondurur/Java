package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDupilcatesFromeTheList2 {
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList();	
		
		list.add("ravi");
		list.add("ravi");
		list.add("siva");
		list.add("ravi");
		
		
		Set<String> set = new HashSet<String>(list);
		List<String> ls = new ArrayList<String>(set);
		
		System.out.println(ls);
		
		
		
		
		
		
		
		
	
}
}