/**
 * You are given a string s. You need to reverse the string.
 *
 * Example 1:
 *
 * Input:
 * s = Geeks
 * Output: skeeG
 * Example 2:
 *
 * Input:
 * s = for
 * Output: rof
 */
public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "Geeks";
        int n = str.length();
        String str2 = "";
        for (int i=n-1;i>=0;i--)
        {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);
    }
}
