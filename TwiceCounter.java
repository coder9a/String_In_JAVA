/**
 * Given a list of N words. Count the number of words that appear exactly twice in the list.
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * list = {Geeks, For, Geeks}
 * Output: 1
 * Explanation: 'Geeks' is the only word that
 * appears twice.
 * Example 2:
 *
 * Input:
 * N = 8
 * list = {Tom, Jerry, Thomas, Tom, Jerry,
 * Courage, Tom, Courage}
 * Output: 2
 * Explanation: 'Jerry' and 'Courage' are the
 * only words that appears twice.
 */

import java.util.*;

public class TwiceCounter
{
    public static void main(String[] args)
    {
        String [] arr = {"geeks", "for", "geeks"};
        HashMap<String, Integer> hmap = new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i], 1);
            }
            else
            {
                hmap.put(arr[i], hmap.get(arr[i])+1);
            }
        }
        System.out.println(hmap);
        for (Map.Entry<String, Integer> it : hmap.entrySet())
        {
            if(it.getValue() == 2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
