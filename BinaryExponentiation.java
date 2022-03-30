import java.lang.*;
import java.io.*;
import java.util.*;
class BinaryExponentiation
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int m=scn.nextInt();
		System.out.println(binary(a,b,m));
	}
	public static int binary(int a,int b,int m)
	{
		int ans=-1;
		if(b==0)
		{
			return a%m;
		}
		int temp=binary(a,b/2,m);
		temp=temp*temp;
		if(b%2==0)
		{
		ans=temp%m;
		}
		else{
			ans=(temp*a)%m;
		}
		return ans;
	}
}