

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2, For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc
 */


public class Problem_9 {
	private static final int PERIMETER = 1000;
		
	public static String pythagoreanTriplet() {
		for (int a = 1; a < PERIMETER; a++) {
			for (int b = a + 1; b < PERIMETER; b++) {
				int c = PERIMETER - a - b;
				if (a * a + b * b == c * c) {
					return Integer.toString(a * b * c);
				}
			}
		}
		throw new AssertionError("Not found");
	}
		
	public static void main(String[] args) {
		System.out.println(pythagoreanTriplet());
	}
}
