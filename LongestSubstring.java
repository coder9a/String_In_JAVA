/**
 * Given a function that takes a binary string.
 * The task is to return the longest size of contiguous substring containing only ‘1’.
 *
 * Input:
 * The first line of input contains an integer T denoting the no of test cases.
 * Then T test cases follow. Each test case contains a string S.
 *
 * Output:
 * For each test case return the maximum length of required sub string.
 *
 * Constraints:
 * 1<=T<=100
 * 1<=|string length|<=104
 *
 * Example:
 * Input:
 * 2
 * 110
 * 11101110
 * Output:
 * 2
 * 3
 */
public class LongestSubstring
{
    public static void main(String[] args)
    {
        String str = "111011110";
        int n = str.length();
        int i, count=1,maxCount=0;
        for (i=0;i<n;i++)
        {
            if(str.charAt(i) == '1')
            {
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else
            {
                count=0;
            }
        }
        System.out.println(maxCount);
    }
}
