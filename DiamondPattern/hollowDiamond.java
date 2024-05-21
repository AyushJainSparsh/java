import java.util.Scanner;

class hollowDiamond
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a Number of Rows :");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j<=n/2 || i<=j-n/2) && i<=n/2)
                System.out.print("*");
                else if((i-n/2>=j || i+j-n/2>=n-1) && i>n/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\t");
            //Unhollow Diamond
            for(int j=0;j<n;j++)
            {
                if(i+j>n/2 && i>j-n/2 && i<=n/2)
                System.out.print("*");
                else if(i-n/2<j && i+j-n/2<n-1 && i>=n/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}