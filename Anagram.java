/**
 * Given two strings a and b consisting of lowercase characters. 
 * The task is to check whether two given strings are an anagram of each other or not. 
 * An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different. 
 * For example, “act” and “tac” are an anagram of each other.
 */
import java.util.*;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Converting string to array
        char tempArray1[] = str1.toCharArray();
        char tempArray2[] = str2.toCharArray();
        // Sorting the strings
        java.util.Arrays.sort(tempArray1);
        java.util.Arrays.sort(tempArray2);
        // Return Sorted string
        String str3 =  new String(tempArray1);
        String str4 =  new String(tempArray2);
        if(str3.equals(str4))
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }
    }
}
