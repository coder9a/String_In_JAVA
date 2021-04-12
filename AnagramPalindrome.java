
import java.util.*;

public class AnagramPalindrome
{
    public static void main(String[] args)
    {
        int [] freq = new int[26];
        int x=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int len = str.length();
        for (int i=0;i<len;i++)
        {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i=0;i<26;i++)
        {
            if(freq[i] == 1)
            {
                x++;
            }
        }
        if(x>1)
        {
            System.out.println("Not Anagram Palindrome");
        }
        else
        {
            System.out.println("Anagram Palindrome");
        }
    }
}
