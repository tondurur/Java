package JavaPractice;

public class PrimeNumbers {
	public static void main(String[] args) {
		
int limit = 50;
		
		for (int number=1; number<=limit; number++) {
			boolean isPrime = true;
	
	    for (int i=2; i<=Math.sqrt(number); i++) {
	    	if (number % i == 0) {
	    		isPrime = false;
	    		break;
	    	}
	    }
	    if (isPrime)
			System.out.println(number + " ");
	 
		
		
		
		
		
		
		
		
		
		
		
	}
	}
}
