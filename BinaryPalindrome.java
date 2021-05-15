/**
 * Given a non-negative integer N. Check whether the Binary Representation of the number is Palindrome or not.
 * Note: No leading 0’s are being considered.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Output: 1
 * Explanation: The Binary Representation of
 * 5 is 101 which is a Palindrome.
 *
 * â€‹Example 2:
 *
 * Input:
 * N = 10
 * Output: 0
 * Explanation: The Binary Representation of
 * 10 is 1010 which is not a Palindrome.
 */
public class BinaryPalindrome
{
    public static long Binary(long n)
    {
        long x,r=0,i=0;
        while (n>0)
        {
            x = n%2;
            r = (long) (r + x*Math.pow(10,i));
            n = n/2;
            i++;
        }
        return r;
    }
    public static void main(String[] args)
    {
        long n = 15351,t;
        long x = Binary(n);
        long temp = x;
        long rem=0;
        System.out.println(x);
        while (x>0)
        {
            t = x%10;
            rem=  rem*10 + t;
            x = x/10;
        }
        System.out.println(rem);
        if(rem==temp)
        {
            System.out.println("Palindrome Binary Number");
        }
        else
        {
            System.out.println("Not Plaindrome Binary Number");
        }
    }
}
