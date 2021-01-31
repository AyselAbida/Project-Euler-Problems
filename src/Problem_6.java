

/* Find the difference between the sum of the squares of the first one hundred natural numbers 
 * and the square of the sum.
 */

public class Problem_6 {

	public static int sumSquareDifferenceArithmetic() {
		int S, S2, n=100, N=100;
		// sum of squares of first 100 natural numbers
		S = n*(n+1)*(2*n+1)/6;
		
		// sum of first 100 natural numbers
		S2 = N * (N+1)/ 2;
		
		// difference 
		S2 = S2*S2;
		return S2 - S;
		
	}

	public static void main(String[] args) {
		System.out.println(sumSquareDifferenceArithmetic());
	}

}
