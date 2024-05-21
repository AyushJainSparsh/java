import java.io.*;
class SelectionSort
{
    int a[];
    int n;
    SelectionSort(int s)
    {
        n=s;
        a=new int[s];
    }

    void display()
    {
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
    }

    void selectionSort()
    {
        System.out.println("\nSelection Sort Technique :");
        for(int i=0;i<n;i++)
        {
            boolean t=true;
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    t=false;
                    min=j;
                }
            }
            if(t)
            break;
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            display();
        }
    }

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Size of an Array :");
        int s=Integer.parseInt(br.readLine());
        SelectionSort ss=new SelectionSort(s);
        System.out.println("\nEnter Elements :");
        for(int i=0;i<s;i++)
        ss.a[i]=Integer.parseInt(br.readLine());
        System.out.println("\nYour Elements :");
        ss.display();
        ss.selectionSort();
        System.out.println("\nSorted Array :");
        ss.display();
    }
}
