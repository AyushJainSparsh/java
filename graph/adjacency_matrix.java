import java.util.*;

class adjacency_matrix
{
    int n;
    int a[][];
    adjacency_matrix(int r)
    {
        n=r+1;
        a=new int[n][n];
    }

    void intialise()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            a[i][j]=0;
        }
    }

    void Display()
    {
        System.out.println();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int r,c,choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Number of Nodes : ");
        r=sc.nextInt();
        adjacency_matrix g=new adjacency_matrix(r);
        g.intialise();
        do 
        {
            System.out.println("\nEnter\n1.To enter relation");
            System.out.println("2.display Your Matrix");
            System.out.println("0.Exit");
            choice=sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("\nEnter relation");
                    r=sc.nextInt();
                    c=sc.nextInt();
                    g.a[r][c]=1;
                    g.a[c][r]=1;
                    break;
                case 2:
                    g.Display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nEnter Valid Choice");
            }
        }
        while (choice!=0);
        System.out.println("\nTHANK YOU");
        sc.close();
    }
}