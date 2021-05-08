/**
 * Given an integer n, your task is to complete the function convertToRoman
 * which prints the corresponding roman number of n. Various symbols and their values are given below.
 *
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 *
 *
 * Example 1:
 *
 * Input:
 * n = 5
 * Output: V
 *
 *
 * Example 2:
 *
 * Input:
 * n = 3
 * Output: III
 */
public class ConvertToRoman
{
    public static void main(String[] args)
    {
        int n = 565;
        String result = "";
        String [] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int [] num = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int myNum = n;
        for(int i=12;i>=0;i--)
        {
            while(myNum>=num[i])
            {
                result += roman[i];
                myNum -= num[i];
            }
        }
        System.out.println(result);
    }
}
