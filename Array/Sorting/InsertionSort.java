import java.io.*;
class InsertionSort
{

    int a[];
    int s;

    InsertionSort(int s)
    {
        this.s=s;
        a=new int[s];
    }

    void insertionSort()
    {
        int n=a.length;
        System.out.println();
        for(int i=1;i<n;i++)
        {
            int key=a[i];
            int j=i-1;
            while (j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            System.out.println("Pass "+i);
            display();
        }
    }

    void display()
    {
        for(int i=0;i<s;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
    }

    public static void main(String[] args)throws IOException
    {    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Size of array");
        int s=Integer.parseInt(br.readLine());
        InsertionSort is=new InsertionSort(s);
        System.out.println("\nEnter Elements :");
        for(int i=0;i<s;i++)
        is.a[i]=Integer.parseInt(br.readLine());
        System.out.println("\nYour Elements :");
        is.display();
        is.insertionSort();
        System.out.println("\nYour Sorted Array is :");
        is.display();
    }
}
