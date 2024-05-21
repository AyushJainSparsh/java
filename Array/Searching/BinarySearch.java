import java.io.*;
class BinarySearch 
{
    public static void main(String[] args)throws IOException
    {
        int i,a[];
        BufferedReader br=new BufferedReader
        (new InputStreamReader(System.in));
        System.out.println("\nEnter Size of Array");
        int size=Integer.parseInt(br.readLine());
        a=new int[size];
        System.out.println("\nEnter Elements of an array");
        for(i=0;i<size;i++)
        a[i]=Integer.parseInt(br.readLine());

        System.out.print("Your Elements : " );
        for(i=0;i<size;i++)
        System.out.print(a[i]+"\t");
        System.out.println("\n\nEnter Element you want to search");
        int key=Integer.parseInt(br.readLine());
        int f=size-1,mid=-1;
        i=0;
        while (i<=f) 
        {
            mid=(i+f)/2;
            if(a[mid]==key)
            break;
            if(a[mid]<key)
            i=mid+1;
            if(a[mid]>key)
            f=mid-1;
        }
        if(i>f)
        System.out.println("\n"+key +" is not exist in array");
        else
        System.out.println("\n"+key+" is exist in "+mid+" index");
    }
}