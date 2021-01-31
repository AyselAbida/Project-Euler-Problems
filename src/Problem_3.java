
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/* The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143?
*/



public class Problem_3 {
	public static List<Integer> largestPrimeFactor() {
		long n =  600851475143L;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add((int) n);
        }
	    return factors;
	}

	public static void main(String[] args) {
		Integer max = Collections.max(largestPrimeFactor());  
		System.out.println("Largest prime factor is "+ max);

	}

}
