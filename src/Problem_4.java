

/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem_4 {
	
	public static int largestPalindromeProduct() {
        for(int i = 999; i >= 100; i--)
        {
            for(int j = i; j >= 100; j--)
            {
                int N = i * j;
                if(isPalindrome(N))
                    return N;
            }
        }
        return 0;
	}
	
	public static Boolean isPalindrome(int n) {
		int R = 0, N = n;
        while(n > 0)
        {
            R = R * 10 + n%10;
            n = (int)Math.floor(n / 10);
        }
        if(R == N)
            return true;
        return false;
	}
	public static void main(String[] args) {
		int answer = largestPalindromeProduct();
		System.out.println(answer);
	}

}
