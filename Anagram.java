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
        char tempArray1[] = str1.toCharArray();
        char tempArray2[] = str2.toCharArray();
        java.util.Arrays.sort(tempArray1);
        java.util.Arrays.sort(tempArray2);

        // return new sorted string
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
