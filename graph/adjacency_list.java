import java.util.*;

public class adjacency_list 
{
    int n;
    int a[];
    LinkedList<Integer> arr[];

    adjacency_list(int r)
    {
        n=r;
        a=new int[n];
        arr=new LinkedList[n];
    }

    void add(int r,int c)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(a[i]==r)
            break;
        }
        arr[i].addLast(c);
    }

    void display()
    {
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" -> "+arr[i]);
            
            System.out.println();
        }
    }



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter number of nodes");
        int r,choice;
        r=sc.nextInt();
        adjacency_list a=new adjacency_list(r);
        System.out.println("Enter Elements");
        for(int i=0;i<a.n;i++)
        {
            a.a[i]=sc.nextInt();
            a.arr[i]=new LinkedList<>();
        }
        do 
        {
            System.out.println("\nEnter\n1.To Enter Relation");
            System.out.println("2.Display Your List");
            System.out.println("0.Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter Relation :");
                    r=sc.nextInt();
                    int c=sc.nextInt();
                    if(r!=c)
                    {
                        a.add(r,c);
                        a.add(c,r);
                    }
                    else
                    a.add(r,c);
                    break;
                case 2:
                    a.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nEnter valid choice");
            }
        }
        while(choice!=0);
        sc.close();
        System.out.println("\nTHANK YOU\n");
    }
}
