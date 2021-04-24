/**
 * Given a string str containing alphanumeric characters.
 * The task is to calculate the sum of all the numbers present in the string.
 *
 * Example 1:
 *
 * Input:
 * str = 1abc23
 * Output: 24
 * Explanation: 1 and 23 are numbers in the
 * string which is added to get the sum as
 * 24.
 * Example 2:
 *
 * Input:
 * str = geeks4geeks
 * Output: 4
 * Explanation: 4 is the only number, so the
 * sum is 4.
 */
public class SumOfNumbers
{
    public static void main(String[] args)
    {
        String str = "1abfdewtrc23";
        str = str + " ";
        int n = str.length();
        long sum = 0;
        String s = "";

        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                s += ch;
            }
            else if(s.length()>0)
            {
                sum+=Integer.parseInt(s);
                s="";
            }
        }
        System.out.println(sum);
    }
}