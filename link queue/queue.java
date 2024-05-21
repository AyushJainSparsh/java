import java.util.*;
class queue 
{
    class node
    {
        int data;
        node next;
        node(int n)
        {
            data=n;
            next=null;
        }
    }

    node front;
    node rear;

    queue()
    {
        front=null;
        rear=null;
    }

    void enqueue(int k)
    {
        node n=new node(k);
        if(rear==null)
        {
            front=n;
            rear=n;
            return;
        }
        rear.next=n;
        rear=n;
    }

    void dequeue()
    {
        if(front==null)
        {
            System.out.println("\nQueue is Underflow");
            return;
        }
        if(front==rear)
        {
            System.out.println("\n"+front.data+" is deleted");
            front=null;
            rear=null;
            return;
        }
        System.out.println("\n"+front.data+" is deleted");
        front=front.next;
    }
    
    void Display()
    {
        if(front==null)
        {
            System.out.println("\nQueue Is Underflow");
            return;
        }
        node t=front;
        while(t!=rear)
        {
            System.out.print(t.data+"\t");
            t=t.next;
        }
        System.out.println(t.data);
    }

    public static void main(String[] args) 
    {
        queue q=new queue();
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nEnter :\n1.Enqueue");
            System.out.println("2.Dequeue\n3.Display");
            System.out.println("0.Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                    System.out.println("\nEnter your Element :");
                    int n=sc.nextInt();
                    q.enqueue(n);
                    break;
                case 2 :
                    q.dequeue();
                    break;
                case 3 :
                    q.Display();
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("Enter Valid Choice");
            }
        }
        while(choice!=0);
        System.out.println("\nThank You For Queue\n");
    }
}
