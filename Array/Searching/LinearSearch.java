import java.io.*;
class LinearSearch
{
    public static void main(String[] args) throws IOException
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
        for(i=0;i<size;i++)
        {
            if(a[i]==key)
            break;
        }
        if(i==size)
        System.out.println("\n"+key +" is not exist in array");
        else
        System.out.println("\n"+key+" is exist in "+i+" index");
    }
}