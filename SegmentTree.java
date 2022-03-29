import java.lang.*;
import java.io.*;
import java.util.*;
class SegmentTree
{
     public static void build(int index,int low,int high,int arr[],int seg[])
	{
		if(low==high)
		{
			seg[index]=arr[low];
			return;
		}
		int mid=(low+high)/2;
		build(2*index+1,low,mid,arr,seg);
		build(2*index+2,mid+1,high,arr,seg);
		seg[index]=Math.min(seg[2*index+1],seg[2*index+2]);
	}
	public static int queries(int index,int low,int high,int l,int r,int seg[])
	{
		if(high<l || r<low)
		{
			return Integer.MAX_VALUE;
		}
		if(low>=l && high<=r)
		{
			return seg[index];
		}
		int mid=(low+high)/2;
		int left=queries(2*index+1,low,mid,l,r,seg);
		int right=queries(2*index+2,mid+1,high,l,r,seg);
		return Math.min(left,right);
	}
	public static void update(int index,int low,int high,int i,int val,int seg[])
	{
         if(low==high)
         {
         	seg[index]=val;
         	return;
         }
         int mid=(low+high)/2;
         if(i<=mid)
         {
         	update(2*index+1,low,mid,i,val,seg);
         }
         else{
         	update(2*index+2,mid+1,high,i,val,seg);
         }
         seg[index]=Math.min(seg[2*index+1],seg[2*index+2]);
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		int seg[]=new int[4*n];
		build(0,0,n-1,arr,seg);
		int q=scn.nextInt();
		while(q-->0)
		{
			int type=scn.nextInt();
			if(type==1)
			{
				int l=scn.nextInt();
				int r=scn.nextInt();
				System.out.println(queries(0,0,n-1,l,r,seg));
			}
			else{
				int i=scn.nextInt();
				int val=scn.nextInt();
				update(0,0,n-1,i,val,seg);
				arr[i]=val;
			}
		}
	}
}