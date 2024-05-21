import java.io.*;

class ShellSort
{
    int a[];
    int n;

    ShellSort(int s)
    {
        n=s;
        a=new int[s];
    }

    void sort()
    {
        System.out.println();
        for(int gap=n/2;gap>0;gap=gap/2)
        {
            for(int i=gap;i<n;i++)
            {
                int k=a[i];
                int j=i;
                while(j>=gap && a[j-gap]>k)
                {
                    a[j]=a[j-gap];
                    j-=gap;
                }
                a[j]=k;
            }
            System.out.println("Gap = "+gap);
            display();
        }
    }

    void display()
    {
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
    }

    public static void main(String[] args)throws IOException
    {
        int s;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Size of Array :");
        s=Integer.parseInt(br.readLine());
        ShellSort ss=new ShellSort(s);

        System.out.println("\nEnter Elements :");
        for (int i = 0; i < ss.n; i++) 
        ss.a[i]=Integer.parseInt(br.readLine());

        System.out.println("\nYours Element :");
        ss.display();

        ss.sort();

        System.out.println("\nElements After Sorting :");
        ss.display();
    }
    
}
