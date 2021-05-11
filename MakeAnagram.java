/**
 * Given two strings S1 and S2 in lowercase, the task is to make them anagram.
 * The only allowed operation is to remove a character from any string.
 * Find the minimum number of characters to be deleted to make both the strings anagram.
 * Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.
 *
 * Example 1:
 *
 * Input:
 * S1 = bcadeh
 * S2 = hea
 * Output: 3
 * Explanation: We need to remove b, c
 * and d from S1.
 * Example 2:
 *
 * Input:
 * S1 = cddgk
 * S2 = gcd
 * Output: 2
 * Explanation: We need to remove d and
 * k from S1.
 */
class MakeAnagram
{
    public static void main(String[] args)
    {
        String s1 = "bcadeh";
        String s2 = "hea";
        int sum = 0;
        int n1 = s1.length();
        int n2 = s2.length();
        char[] arr1 = new char[26];
        char[] arr2 = new char[26];
        for (int i=0;i<n1;i++)
        {
            arr1[s1.charAt(i) - 'a']++;
        }
        for (int i=0;i<n2;i++)
        {
            arr2[s2.charAt(i) - 'a']++;
        }
        for (int i=0;i<26;i++)
        {
            sum += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println(sum);
    }
}
