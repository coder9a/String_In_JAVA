/**
 * Given a string, Your task is to  complete the function
 * encode that returns the run length encoded string for the given string.
 * eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
 * You are required to complete the function encode that takes only one argument
 * the string which is to be encoded and returns the encoded string.
 *
 * Example 1:
 *
 * Input:
 * str = aaaabbbccc
 * Output: a4b3c3
 * Explanation: a repeated 4 times
 * consecutively b 3 times, c also 3
 * times.
 * Example 2:
 *
 * Input:
 * str = abbbcdddd
 * Output: a1b3c1d4
 */

public class LengthEncoding
{
    public static void main(String[] args)
    {
        String str = "aaaabbbccc";
        int n = str.length();
        int c=1,i;
        String str2 = "";
        for (i=0;i<n-1;i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                c++;
            }
            else
            {
                str2 = str2 + (str.charAt(i));
                str2 = str2 + c;
                c=1;
            }
        }
        str2 = str2 + (str.charAt(i));
        str2 = str2 + c;
        System.out.println(str2);
    }
}
