/**
 * Your task  is to implement the function atoi.
 * The function takes a string(str) as argument and converts it to an integer and returns it.
 *
 * Note: You are not allowed to use inbuilt function.
 *
 * Example 1:
 *
 * Input:
 * str = 123
 * Output: 123
 *
 * Example 2:
 *
 * Input:
 * str = 21a
 * Output: -1
 * Explanation: Output is -1 as all
 * characters are not digit only.
 */
public class ImplementAtoi
{
    public static void main(String[] args)
    {
        String str = "-12";
        int n = str.length();
        int res=0, x,sum=0,j=0,flag = 0,i=0;
        int sign=1;
        if(str.charAt(0)=='-')
        {
            sign = -1;
            i++;
        }
        for(;i<n;i++)
        {
            if(str.charAt(i)<'0'||str.charAt(i)>'9')
            {
                flag = 1;
                break;
            }
            else
            {
                x = str.charAt(i) - '0';
                res = (res*10)+x;
            }
        }
        if(flag==1)
            System.out.println("-1");
        else
            System.out.println(res*sign);
    }
}
