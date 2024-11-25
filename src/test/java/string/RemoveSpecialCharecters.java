package string;

public class RemoveSpecialCharecters {
	public static void main(String[] args) {
		
		
		String str = "r!@a#$v%^i*(";
		String data = str.replaceAll("[^A-Z,a-z,1-9]", "");
		System.out.println(data);
		
		
		
		
		
		}
	}


