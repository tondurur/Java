package string;

public class RemoveDupilcateCharecters {
	public static void main(String[] args) {
		
		String str = "raavii";
		
		StringBuffer sb = new StringBuffer();
		str.chars().distinct().forEach(c ->sb.append((char)c));
		System.out.println(sb);
		
		
		
	}

}
 







