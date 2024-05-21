import java.io.*;
class BubbleSort
{

    int a[];
    int s;

    BubbleSort(int s)
    {
        this.s=s;
        a=new int[s];
    }

    void bubbleSort()
    {
        System.out.println("\nBubble sorting Technique :");
        for(int i=0;i<s;i++)
        {
            boolean t=true;
            for(int j=0;j<s-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=false;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(t)
            break;
            display();
        }
    }

    void display()
    {
        for(int i=0;i<s;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter Size of array");
        int s=Integer.parseInt(br.readLine());
        BubbleSort bs=new BubbleSort(s);
        System.out.println("\nEnter Elements :");
        for(int i=0;i<s;i++)
        bs.a[i]=Integer.parseInt(br.readLine());
        System.out.println("\nYour Elements :");
        bs.display();
        bs.bubbleSort();
        System.out.println("\nYour Sorted Array is :");
        bs.display();
    }
}