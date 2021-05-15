/**
 * Given a string S, the task is to change the complete string to Uppercase or Lowercase
 * depending upon the case for the first character.
 *
 * Example 1:
 *
 * Input:
 * S = "abCD"
 * Output: abcd
 * Explanation: The first letter (a) is
 * lowercase. Hence, the complete string
 * is made lowercase.
 *
 * â€‹Example 2:
 *
 * Input:
 * S = "Abcd"
 * Output: ABCD
 * Explanation: The first letter (A) is
 * uppercase. Hence, the complete string
 * is made uppercase.
 */
public class ChangeString
{
    public static void main(String[] args)
    {
        String str = "XabCD";
        String str2 = "";
        int n = str.length();
        int flag=0;
        if(str.charAt(0) >= 'A' && str.charAt(0) <='Z')
            flag = 1;
        for(int i=0;i<n;i++)
        {
            if(flag==1)
            {
                if(str.charAt(i)>='a' && str.charAt(i) <='z')
                {
                    char ch = str.charAt(i);
                    ch = (char) (ch - 32);
                    str2 += ch;
                }
                if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                    str2 += str.charAt(i);
                }
            }
            else
            {
                if(str.charAt(i)>='a' && str.charAt(i) <='z')
                {
                    str2 += str.charAt(i);
                }
                if(str.charAt(i)>='A' && str.charAt(i) <='Z')
                {
                    char ch = str.charAt(i);
                    ch = (char) (ch + 32);
                    str2 += ch;
                }
            }
        }
        System.out.println(str2);
    }
}
