import java.lang.*;
import java.io.*;
import java.util.*;
class Upper_Bound
{
    public static void main(String[] args)
    {
        int arr[]={1,3,4,5,6};
        int x=6;
        System.out.println(lower(arr,x));
    }
    public static int lower(int arr[],int x)
    {
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}