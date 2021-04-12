import java.util.Scanner;

public class CharacterFrequency
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
        for (int i=0;i<len;i++)
        {
            if(freq[str.charAt(i) - 'a'] != 0)
            {
                System.out.print(str.charAt(i) +" : "+freq[str.charAt(i)-'a']+" ");
            }
        }
    }
}
