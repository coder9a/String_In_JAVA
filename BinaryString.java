/**
 * Given a binary string S.
 * The task is to count the number of substrings that start and end with 1.
 * For example, if the input string is “00100101”,
 * then there are three substrings “1001”, “100101” and “101”.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * S = 1111
 * Output: 6
 * Explanation: There are 6 substrings from
 * the given string. They are 11, 11, 11,
 * 111, 111, 1111.
 * Example 2:
 *
 * Input:
 * N = 5
 * S = 01101
 * Output: 3
 * Explanation: There 3 substrings from the
 * given string. They are 11, 101, 1101.
 */
public class BinaryString
{
    public static void main(String[] args)
    {
//        ------------------------------------------------------------------
//                Time Complexity = O(n^2)
//        String str = "01101";
//        int n = str.length();
//        int i=0,x=0, count=0;
//        while(i<n)
//        {
//            if(str.charAt(i) == '1')
//            {
//                x=i+1;
//                while(x<n)
//                {
//                    if(str.charAt(x)=='1')
//                    {
//                        count++;
//                    }
//                    x++;
//                }
//            }
//            i++;
//        }
//        System.out.println(count);
//        ------------------------------------------------------------------
//                Time Complexity = O(n)
        String str = "01101";
        int n = str.length();
        int i=0,x=0, count=0;
        for (i=0;i<n;i++)
        {
            if(str.charAt(i) == '1')
            {
                count++;
            }
        }
        count = count*(count-1)/2;
        System.out.println(count);
    }
}


















