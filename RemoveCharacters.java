/**
 * Given two strings string1 and string2, remove those characters from first string(string1)
 * which are present in second string(string2).
 * Both the strings are different and contain only lowercase characters.
 * NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 *
 *
 * Example 1:
 *
 * Input:
 * string1 = "computer"
 * string2 = "cat"
 * Output: "ompuer"
 * Explanation: After removing characters(c, a, t)
 * from string1 we get "ompuer".
 * Example 2:
 *
 * Input:
 * string1 = "occurrence"
 * string2 = "car"
 * Output: "ouene"
 * Explanation: After removing characters
 * (c, a, r) from string1 we get "ouene".
 */
public class RemoveCharacters
{
    public static void main(String[] args)
    {
        String str1 = "computer";
        String str2 = "cat";
        String str3 = "";
        int n = str1.length();
        int [] count = new int[256];
        for (int i=0;i<str2.length();i++)
        {
            count[str2.charAt(i)]++;
        }
        int i=0;
        while (i != str1.length())
        {
            if (count[str1.charAt(i)] == 0)
            {
                str3 += str1.charAt(i);
            }
            i++;
        }
        System.out.println(str3);
    }
}
