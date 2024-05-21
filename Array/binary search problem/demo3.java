/*
 *  Input = Mountain Array{ 5 ,  9 , 11 , 15 , 8 , 6 , 4}
 *  Output = peek = 15
 */

class demo3 
{
    public static void main(String[] args) 
    {
        int[] a =  { 15 , 8 , 6 , 4};
        int s  = 0 , e = a.length-1 , mid = 0;
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
    }
}
