/**
 * Given a string check if it is Pangram or not.
 * A pangram is a sentence containing every letter in the English Alphabet.
 *
 * Example 1:
 *
 * Input:
 * S = Bawds jog, flick quartz, vex nymph
 * Output: 1
 * Explantion: In the given input, there
 * are all the letters of the English
 * alphabet. Hence, the output is 1.
 * Example 2:
 *
 * Input:
 * S = sdfs
 * Output: 0
 * Explantion: In the given input, there
 * aren't all the letters present in the
 * English alphabet. Hence, the output
 * is 0.
 */

import java.util.Arrays;

public class Pangram
{
    public static void main(String[] args)
    {
        String str = "Bawds jog, flick quartz, vex nymph";
        int n = str.length();
        int index, flag=0;
        boolean [] arr = new boolean[26];
        Arrays.fill(arr, false);
        for (int i=0;i<n;i++)
        {
            if('A' <= str.charAt(i) && str.charAt(i) <='Z')
                index = str.charAt(i) - 'A';
            else if('a' <=str.charAt(i) && str.charAt(i)<='z')
                index = str.charAt(i) - 'a';
            else
                continue;
            arr[index] = true;
        }
        for (int i=0;i<26;i++)
        {
            if(arr[i] == false)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if (flag==1)
            System.out.println("Not Pangram");
        else
            System.out.println("Pangram");
    }
}
