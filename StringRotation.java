/**
 * Given two strings a and b.
 * The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.
 *
 * Example 1:
 *
 * Input:
 * a = amazon
 * b = azonam
 * Output: 1
 * Explanation: amazon can be rotated anti
 * clockwise by two places, which will make
 * it as azonam.
 * Example 2:
 *
 * Input:
 * a = geeksforgeeks
 * b = geeksgeeksfor
 * Output: 0
 * Explanation: If we rotate geeksforgeeks by
 * two place in any direction , we won't get
 * geeksgeeksfor.
 */
public class StringRotation
{
    public static void main(String[] args)
    {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        if(s1.length() == s2.length() && (s1+s1).contains(s2))
            System.out.println("String are rotation of each other");
        else
            System.out.println("Strings are not rotation if each other");
    }
}






















