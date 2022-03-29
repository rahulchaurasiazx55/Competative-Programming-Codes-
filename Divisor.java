import java.lang.*;
import java.io.*;
import java.util.*;
class Divisor
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(count1(n));
	}

	//Approach 1 Time O(n)
	public static int count(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
	// Approach 2 Time O(sqrt(n))
	public static int count1(int n)
	{
		int count=0;
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				if(i!=(n/i))
				{
					count++;
				}
			}
		}
		return count;
	}
}