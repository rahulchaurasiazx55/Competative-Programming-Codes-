import java.lang.*;
import java.io.*;
import java.util.*;
class SieveOfEratosthenes
{
	static void sieve(int n)
	{
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<n;i++)
			prime[i]=true;
		for(int p=2;p*p<=n;p++)
		{
			if(prime[p]==true)
			{
				for(int i=p*2;i<=n;i+=p)
					prime[i]=false;
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==true)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		int n=30;
		sieve(n);
	}
}