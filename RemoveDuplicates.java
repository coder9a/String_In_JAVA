/**
 * Given a string without spaces, the task is to remove duplicates from it.
 *
 * Note: The original order of characters must be kept the same.
 *
 * Example 1:
 *
 * Input: S = "zvvo"
 * Output: "zvo"
 * Explanation: Only keep the first
 * occurrence
 * Example 2:
 *
 * Input: S = "gfg"
 * Output: gf
 * Explanation: Only keep the first
 * occurrence
 */

import java.util.LinkedHashSet;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
//        ---------------------------------------------------
//        Time Complexity = O(n^2)
//        String str = "zvovo";
//        String str2 = "";
//        int flag=0;
//        int n = str.length();
//        for (int i=0;i<n;i++)
//        {
//            int j;
//            for(j=0;j<i;j++)
//            {
//                if(str.charAt(i) == str.charAt(j))
//                {
//                    break;
//                }
//            }
//            if(i==j)
//            {
//                str2 += str.charAt(i);
//            }
//        }
//        System.out.println(str2);
//        ---------------------------------------------------
//        Time Complexity = O(n)
        String str = "zvovo";
        String str2 = "";
        LinkedHashSet<Character> LHS = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(!LHS.contains(str.charAt(i)))
            {
                LHS.add(str.charAt(i));
            }
        }
        for (Character ch : LHS)
        {
            str2 += ch;
        }
        System.out.println(str2);
    }
}
