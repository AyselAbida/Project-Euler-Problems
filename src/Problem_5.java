import java.math.BigInteger;


/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */


public class Problem_5 {
	public static String run() {
		BigInteger lcm = BigInteger.ONE;
		for (int i = 1; i <= 20; i++) {
			lcm = lcm(BigInteger.valueOf(i), lcm);
		}
		return lcm.toString();
	}
	
	private static BigInteger lcm(BigInteger x, BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
	}

	public static void main(String[] args) {
		System.out.println(run());
	}

}
