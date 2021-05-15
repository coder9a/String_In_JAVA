/**
 * Given a string with brackets ('[' and ']') and the index of an opening bracket.
 * Find the index of the corresponding closing bracket.
 *
 * Example 1:
 *
 * Input:
 * S = "[ABC[23]][89]"
 * pos = 0
 * Output: 8
 * Explanation: [ABC[23]][89]
 * The closing bracket corresponding to the
 * opening bracket at index 0 is at index 8.
 *
 * â€‹Example 2:
 *
 * Input:
 * S = "ABC[58]"
 * pos = 3
 * Output: 6
 * Explanation: ABC[58]
 * The closing bracket corresponding to the
 * opening bracket at index 3 is at index 6.
 */
public class ClosingBracketIndex
{
    public static void main(String[] args)
    {
        String str = "[ABC[23]][89]";
        int n = str.length();
        int pos = 0;
        int i;
        int count = 0;
        for (i=pos;i<n;i++)
        {
            if(str.charAt(i) == '[')
            {
                count++;
            }
            else if(str.charAt(i) == ']')
            {
                count--;
                if(count==0)
                    break;
            }
        }
        System.out.println(i);
    }
}
