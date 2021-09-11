import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int i, p1=-1, p2=-1, sum=0;
        ArrayList<Integer> sumlist = new ArrayList<>();
        
        while(p2 < n-1)
        {
            if(sum == s)
            {
                sumlist.add(p1+2);
                sumlist.add(p2+1);
                return sumlist;
            }
            else if(sum < s)
            {
                p2 = p2 + 1;
                sum = sum + arr[p2];
                System.out.println("p1: "+p1+" p2: "+p2+" sum:"+sum);
                while((sum>s) && (p1 <= p2))
                {
                    sum = sum - arr[p1];
                    p1 = p1 + 1;
                    System.out.println("p1: "+p1+" p2: "+p2+" sum:"+sum);
                }
            }
        }
        sumlist.add(-1);
        return sumlist;
    }
}