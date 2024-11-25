package JavaPractice;

public class OccurenceofTheCharecters2 {
	public static void main(String[] args) {

		String str = "raavisaankaar";

		int data = str.length();
		int dataafter = str.replace("a", "").length();
		int st = data-dataafter;

		System.out.println(st);


	}









}
