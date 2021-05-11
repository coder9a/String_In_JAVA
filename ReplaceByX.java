/**
 * Given a string and a pattern, Replace all the continuous occurrence of pattern with a single X in the string.
 * For a clear view see the example below.
 *
 * Input:
 *
 * The first line of input contains an integer T denoting the number of test cases.
 * The first line of each test case is string str.
 * The second line of each test case contains a string s,which is a pattern.
 *
 * Output:
 *
 * Print the modified string str.
 *
 * Constraints:
 *
 * 1 ≤ T ≤ 100
 * 1 ≤ size of str,s ≤ 1000
 *
 * Example:
 *
 * Input
 * 2
 * abababcdefababcdab
 * ab
 * geeksforgeeks
 * geeks
 *
 * Output
 * XcdefXcdX
 * XforX
 */
public class ReplaceByX
{
    public static void main(String[] args)
    {
        String str = "abababcdefababcdab";
        String str2 = str.replace("ab", "X");
        for(int i=0;i<str2.length();i++)
        {
            if(str2.contains("XX"))
                str2 = str2.replace("XX","X");
            else
                break;
        }
        System.out.println(str2);
    }
}
