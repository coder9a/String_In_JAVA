/**
 * Given a string S of lowercase alphabets, check if it is isogram or not.
 * An Isogram is a string in which no letter occurs more than once.
 *
 * Example 1:
 *
 * Input:
 * S = machine
 * Output: 1
 * Explanation: machine is an isogram
 * as no letter has appeared twice. Hence
 * we print 1.
 * Example 2:
 *
 * Input:
 * S = geeks
 * Output: 0
 * Explanation: geeks is not an isogram
 * as 'e' appears twice. Hence we print 0.
 */

import java.util.Arrays;

public class Isogram
{
    public static void main(String[] args)
    {
        String str = "geeks";
        char [] ch = str.toCharArray();
        Arrays.sort(ch);
        int flag = 0, i;
        int n = ch.length;
        for (i=0;i<n-1;i++)
        {
            if(ch[i] == ch[i+1])
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Not Isogram");
        }
        else
        {
            System.out.println("Isogram");
        }
    }
}
