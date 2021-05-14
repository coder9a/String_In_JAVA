/**
 * Given a string S consisting of uppercase and lowercase characters.
 * The task is to sort uppercase and lowercase letters separately such that
 * if the ith place in the original string had an Uppercase character then
 * it should not have a lowercase character after being sorted and vice versa.
 *
 * Example 1:
 *
 * Input:
 * N = 12
 * S = defRTSersUXI
 * Output: deeIRSfrsTUX
 * Explanation: Sorted form of given string
 * with the same case of character as that
 * in original string is deeIRSfrsTUX
 * Example 2:
 *
 * Input:
 * N = 6
 * S = srbDKi
 * Output: birDKs
 * Explanation: Sorted form of given string
 * with the same case of character will
 * result in output as birDKs.
 */

import java.util.ArrayList;
import java.util.Collections;

public class CaseSpecificSorting
{
    public static void main(String[] args)
    {
        String str = "defRTSersUXI";
        int n = str.length();
        String str2 = "";
        ArrayList<Character> arl1 = new ArrayList<>();
        ArrayList<Character> arl2 = new ArrayList<>();
        ArrayList<Character> arl3 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                arl1.add(str.charAt(i));
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                arl2.add(str.charAt(i));
            }
        }
        Collections.sort(arl1);
        Collections.sort(arl2);
        int j=0,k=0;
        for (int i=0;i<n;i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                str2 += arl1.get(j++);
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                str2 += arl2.get(k++);
            }
        }
        System.out.println(str2);
    }
}
