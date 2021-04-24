public class Palindrome
{
    public static void main(String[] args)
    {
        String str = "ala";
        int n = str.length();
        String str2 = "";
        for(int i=n-1;i>=0;i--)
        {
            str2 += str.charAt(i);
        }
        if(str.equals(str2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
