package JavaPractice;

public class SwappingTwoNumbers {
	public static void main(String[] args) {


		int a = 2;
		int b = 4;
		
		System.out.println("Before swpping");
		System.out.println(a);
		System.out.println(b);
		
		 a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
		
	}

}
