import java.io.*;
class MergeSort
{
    int a[],size;

    void display()
    {
        for(int i=0;i<size;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
    }

    void sort(int i,int f)
    {
        if(i<f)
        {
            int m=i+(f-i)/2;
            sort(i, m);
            sort(m+1, f);
            merge(i,m,f);
        }
    }

    void merge(int i,int m,int f)
    {
        int n1=m-i+1;
        int n2=f-m;
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        for(int j=0;j<n1;j++)
        a1[j]=a[i+j];
        for(int j=0;j<n2;j++)
        a2[j]=a[m+j+1];

        int i1=0,i2=0;
        while(i1<n1 && i2<n2)
        {
            if(a1[i1]<a2[i2])
            {
                a[i]=a1[i1];
                i1++;
            }
            else
            {
                a[i]=a2[i2];
                i2++;
            }
            i++;
        }
        while(i1<n1)
        {
            a[i]=a1[i1];
            i++;
            i1++;
        }
        while(i2<n2)
        {
            a[i]=a2[i2];
            i++;
            i2++;
        }
    }

    public static void main(String[] args)throws IOException
    {
        MergeSort ms=new MergeSort();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Size of Array : ");
        ms.size=Integer.parseInt(br.readLine());
        ms.a=new int[ms.size];
        System.out.println("\nEnter Elements of Array :");
        for(int i=0;i<ms.size;i++)
        ms.a[i]=Integer.parseInt(br.readLine());
        System.out.println("\nOriginal Array : ");
        ms.display();
        ms.sort(0,ms.size-1);
        System.out.println("\nSorted Array :");
        ms.display();
    }
}