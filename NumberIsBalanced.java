/**
 * Given an integer N which has odd number of digits,
 * find whether the given number is a balanced or not.
 * An odd digit number is called a balanced number if the sum of all digits
 * to the left of the middle digit and the sum of all digits to the right of the middle digit is equal.
 *
 * Example 1:
 *
 * Input:
 * N = 1234006
 * Output: 1
 * Explanation: Total number of digits in
 * N = 7. Middle digit is 4. LHS = 1+2+3 = 6
 * and RHS = 0+0+6 = 6. LHS is equal to RHS.
 *
 * Example 2:
 *
 * Input:
 * N = 12345
 * Output: 0
 * Explanation: LHS = 1+2 = 3 and RHS = 4+5
 * = 9. LHS and RHS are not equal.
 */
public class NumberIsBalanced
{
    public static void main(String[] args)
    {
        String str = "1234006";
        int n = str.length();
        int x=0,y=0,j=0, mid=n/2;
        for (int i = 0; i<mid; i++)
        {
            x = x + (str.charAt(i) - '0');
        }
        for (int i = mid+1; i<n; i++)
        {
            y = y + (str.charAt(i) - '0');
        }
        if(x==y)
            System.out.println("String is Balanced");
        else
            System.out.println("String is not Balanced");
    }
}
