import java.lang.*;
import java.io.*;
import java.util.*;
class Eculid
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner (System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		return gcd(b%a,a);
	}
}