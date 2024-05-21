import java.io.*;
class Swastik
{
    public static void main(String[] args)throws IOException
    {
        int n;
        System.out.println("Enter Number of Rows :");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Integer.parseInt(br.readLine());
        if(n%2==0)
        n++;
        System.out.println("\n\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>n/2)
                System.out.print("*");
                else if(j==0 && i<n/2)
                System.out.print("*");
                else if(i==n-1 && j<n/2)
                System.out.print("*");
                else if(j==n-1 && i>n/2)
                System.out.print("*");
                else if(i==n/2 || j==n/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)
            {
                if(i==1 && j>n/2)
                System.out.print(" ");
                else if(j==1 && i<n/2)
                System.out.print(" ");
                else if(i==n-2 && j<n/2)
                System.out.print(" ");
                else if(j==n-2 && i>n/2)
                System.out.print(" ");
                else if(i==n/2 || j==n/2)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }

    }
}