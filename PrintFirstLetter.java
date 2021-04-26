/**
 * Given a string S, the task is to create a string with the first letter of every word in the string.
 *
 *
 * Example 1:
 *
 * Input:
 * S = "geeks for geeks"
 * Output: gfg
 *
 * Example 2:
 *
 * Input:
 * S = "bad is good"
 * Output: big
 */
public class PrintFirstLetter
{
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        int n = str.length();
        String s  = "";
        s = s + str.charAt(0);
        for (int i=0;i<n;i++)
        {
            if(str.charAt(i) == ' ')
            {
                s = s+str.charAt(i+1);
            }
        }
        System.out.println(s);
    }
}
