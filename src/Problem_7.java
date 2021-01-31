
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13. What is the 10001st prime number?
 */

public class Problem_7 {
	public static int findNthPrimeNumber(int N) {
		int c = 2;
		int n = 0;

		while(c < N) {
			n+= 6;
			if (isPrime(n + 1)) {
				c++;
			}
			if (isPrime(n - 1)) {
				c++;
			}	
		}
		return n + 1;
		
	}
	
	private static boolean isPrime(int N) {
		if(N < 2)
			return false;
		if (N % 2 == 0)
			return false;
		if (N % 3 == 0)
		    return false;
		
		int h = (int)Math.floor(1+Math.sqrt(N));
		int i = 5;
		while (i <= h) {
			if (N % i == 0)
				return false;
			if (N % (i + 2) == 0)
				return false;
			i+= 6;
		}
		  return true;
}

	public static void main(String[] args) {
		System.out.println(findNthPrimeNumber(10001));
	}
}
