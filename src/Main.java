import java.io.*;
import java.lang.*;
import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for( int i = 0; i<t; i++)
		{
			int n = sc.nextInt();
			int s = sc.nextInt();
			
			int[] m = new int[n];
			for(int j = 0; j<n; j++)
			{
				m[j] = sc.nextInt();
			}
			
			Solution obj = new Solution();
			ArrayList<Integer> res = obj.subarraySum(m,n,s);
			for(int i1=0;i1<res.size();i1++)
			{
				System.out.print(res.get(i1)+" ");
			}
			System.out.println();
		}
	}
}
