/*
 * Input = mounted array = { 5 ,  9 , 11 , 15 , 8 , 6 , 4}
 *         key = 9
 * Output = index = 1
 */

class demo4 
{
    public static void main(String[] args) 
    {
        int[] a =  { 5 ,  9 , 11 , 15 , 8 , 6 , 4};
        int s  = 0 , e = a.length-1 , mid = 0 , key = 4;
        while(s<=e && e<a.length)
        {
            mid = (s+e)/2;
            if(mid == a.length-1 || mid == 0)
            break;
            if(a[mid]>a[mid+1] && a[mid] > a[mid - 1])
            break;
            else if(a[mid] < a[mid + 1])
            s = mid + 1 ;
            else
            e = mid - 1;
        }
        System.out.println("Peek Element is "+a[mid]+" at index "+mid);
        int ans = binarySearch(a , key , 0 , mid) ;
        if(ans == -1)
        {
            ans = binarySearch2(a , key , mid , a.length) ;
            if(ans == -1)
            System.out.println("Key is not found");
            else
            System.out.println("Key is found at "+ans);
        }
        else
        System.out.println("Key is found at "+ans);
    }

    static int binarySearch(int[] a,int key,int i , int f)
    {
        while (i<=f) 
        {
            int mid=(i+f)/2;
            if(a[mid]==key)
            return mid;
            if(a[mid]<key)
            i=mid+1;
            if(a[mid]>key)
            f=mid-1;
        }
        return -1;
    }
    static int binarySearch2(int[] a,int key,int i , int f)
    {
        while (i<=f) 
        {
            int mid=(i+f)/2;
            if(a[mid]==key)
            return mid;
            if(a[mid]>key)
            i=mid+1;
            if(a[mid]<key)
            f=mid-1;
        }
        return -1;
    }
}
