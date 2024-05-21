import java.util.*;
class stack 
{
    class node
    {
        int data;
        node next;
        node(int k)
        {
            data=k;
            next=null;
        }
    }
    
    node top;

    stack()
    {
        top=null;
    }

    void push(int k)
    {
        node n=top;
        top=new node(k);
        top.next=n;
    }

    void pop()
    {
        if(top==null)
        {
            System.out.println("\nStack Underflow");
            return;
        }
        System.out.println("\n"+top.data+" is deleted");
        top=top.next;
    }

    void display()
    {
        if(top==null)
        {
            System.out.println("\nStack Underflow");
            return;
        }
        node t=top;
        System.out.println("\nYour Elements :");
        while(t!=null)
        {
            System.out.print(t.data+"\t");
            t=t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        int choice;
        do
        {
            System.out.println("\nEnter :\n1.Push\n2.Pop");
            System.out.println("3.Display\n0.Exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter your Element :");
                    int k=sc.nextInt();
                    s.push(k);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nEnter Valid Choice");
            }
        }
        while(choice!=0);
        System.out.println("\nThank You for Using my Stack\n");
    }
}
