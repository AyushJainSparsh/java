// In infinite array you have to find a key element using binary search

import java.util.Scanner;
import java.util.Arrays;
class demo2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Key Element :");
        int key = sc.nextInt();

        //intialising a array of size 100 randomly
        int a[] = new int[100];
        for( int i = 0 ; i<100 ; i++ )
        a[i] = (int)(Math.random()*100);
        Arrays.sort(a);

        //using binary search 
        int s = 0 , e = 10 , mid =-1;
        boolean flag = false ;
        while(s<e)
        {
            mid = (s+e)/2;
            if(a[mid]==key)
            {
                flag = true;
                break;
            }
            else if(a[mid]>key)
            e=mid-1;
            else
            {
                s=mid+1;
                if(s>=e && e<100)
                e+=10;
            }
        }
        
        //Checking for output
        if(flag)
        System.out.println("Key is present at = "+mid);
        else
        System.out.println("Unsuccessful Search");

        //displaying all elements
        System.out.println("Elements in array :");
        for( int i = 0 ; i<100 ; i++ )
        System.out.print(a[i]+"\t");
    }
}