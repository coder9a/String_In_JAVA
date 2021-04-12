/**
 * Given a string  N representing a positive number.
 * The task is to round N to the nearest multiple of 10.
 * Note: If you are having two multiple equally apart from N
 * then we will choose the smallest element among them.
 */

import java.util.Scanner;

public class NearestMultiple
{
    public static void main(String[] args)
    {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int n = Integer.parseInt(N);
        int a = n%10;
        int b = n/10;
        int c = b*10;
        int res;
        if(a>5)
        {
            res = c+10;
        }
        else
        {
            res = c;
        }
        String str = String.valueOf(res);
        System.out.println(str);
    }
}
