import java.io.*;
public class linkedlist
{
    
    static class node
    {
        int data;
        node next;
        node(int val)
        {
            data=val;
            next=null;
        }
    }
    
    node head;
    
    public static linkedlist insertAtHead(linkedlist list , int val)
    {
        node n=new node(val);
        n.next=list.head;
        list.head=n;
        return list;
    }
    
    public static linkedlist insertAtTail(linkedlist list,int val)
    {
        if(list.head==null)
        {
            list.head=new node(val);
            return list;
        }
        node n=new node(val);
        node t = list.head;
        while(t.next!=null)
        t=t.next;
        t.next=n;
        return list;
    }
    
    public static linkedlist insertAfterKey(linkedlist list,int val,int key)
    {
        node n=new node(val);
        node t=list.head;
        while(t!=null && t.data!=key)
        t=t.next;
        if(t!=null && t.data==key)
        {
            n.next=t.next;
            t.next=n;
        }
        else
        System.out.println("\nKey not found ");
        return list;
    }
    
    public static linkedlist insertAtPos(linkedlist list,int val,int pos)
    {
        if(pos==1)
        return insertAtHead(list,val);
        if(list.head==null)
        {
            System.out.println("Linked List is Empty");
            return list;
        }
        int c=1;
        node n=new node(val);
        node t=list.head;
        while(t.next!=null && c+1!=pos)
        {
            t=t.next;
            c++;
        }
        if(c+1==pos)
        {
            n.next=t.next;
            t.next=n;
        }
        else
        System.out.println("\nEnter Valid Position");
        return list;
    }
    
    public static void display(linkedlist list)
    {
        if(list.head==null)
        System.out.println("\nLinked List is Empty");
        node t=list.head;
        System.out.println("\nElements :");
        while(t!=null)
        {
            System.out.print(t.data+"\t");
            t=t.next;
        }
    }
    
    public static linkedlist delAtHead(linkedlist list)
    {
        if(list.head==null)
        {
            System.out.println("\nLinked List is Empty");
            return list;
        }
        System.out.println("\n"+list.head.data+" is deleted");
        list.head=list.head.next;
        return list;
    }
    
    public static linkedlist delAtTail(linkedlist list)
    {
        if(list.head==null || list.head.next==null)
        return delAtHead(list);
        node t=list.head;
        while(t.next.next!=null)
        t=t.next;
        System.out.println("\n"+t.next.data+" is deleted");
        t.next=null;
        return list;
    }
    
    public static linkedlist delTheKey(linkedlist list, int key)
    {
        if(list.head==null || list.head.data==key)
        return delAtHead(list);
        node t=list.head;
        while(t.next.next!=null && t.next.data!=key)
        t=t.next;
        if(t.next.data==key)
        {
            System.out.println("\n"+key+" is deleted");
            t.next=t.next.next;
        }
        else
        System.out.println("\nKey not found");
        return list;
    }
    
    public static linkedlist delAtPos(linkedlist list,int pos)
    {
        if(list.head==null || pos==1)
        return delAtHead(list);
        int c=1;
        node t=list.head;
        while(t.next.next!=null &&  c+1!=pos)
        {
            t=t.next;
            c++;
        }
        if(c+1==pos)
        {
            System.out.println("\n"+t.next.data+" is deleted");
            t.next=t.next.next;
        }
        else
        System.out.println("\nPosition not found");
        return list;
    }

    public static int length(linkedlist list)
    {
        int len=0;
        node t=list.head;
        while(t!=null)
        {
            len++;
            t=t.next;
        }
        return len;
    }

    public static void search(linkedlist list,int key)
    {
        int i=0;
        boolean f=false;
        node t=list.head;
        while(t!=null)
        {
            i++;
            if(t.data==key)
            {
                f=true;
                break;
            }
            t=t.next;
        }
        if(f)
        System.out.println("\n"+key+" is found at "+i+" position");
        else
        System.out.println("\n"+key+" is not found");
    }

    public static linkedlist reverse(linkedlist list)
    {
       return list;
    }
    
    public static void main(String args[])throws IOException
    {
        linkedlist list=new linkedlist();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice,n,k;
        do
        {
            System.out.println("\nEnter\n1.Insert At Head");
            System.out.println("2.Insert At Tail");
            System.out.println("3.Insert After Key");
            System.out.println("4.Insert At Position");
            System.out.println("5.Display");
            System.out.println("6.Delete The Head");
            System.out.println("7.Delete The Tail");
            System.out.println("8.Delete The Key");
            System.out.println("9.Delete The Position");
            System.out.println("10.Length of Linked List");
            System.out.println("11.Searching");
            System.out.println("12.To reverse");
            System.out.println("0.Exit");
            choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1 :
                    System.out.print("\nEnter Element : ");
                    n=Integer.parseInt(br.readLine());
                    list=insertAtHead(list,n);
                    break;
                case 2 :
                    System.out.print("\nEnter Element : ");
                    n=Integer.parseInt(br.readLine());
                    list=insertAtTail(list,n);
                    break;
                case 3 :
                    System.out.print("\nEnter Element : ");
                    n=Integer.parseInt(br.readLine());
                    System.out.print("Enter Key : ");
                    k=Integer.parseInt(br.readLine());
                    list=insertAfterKey(list,n,k);
                    break;
                case 4 :
                    System.out.print("\nEnter Element : ");
                    n=Integer.parseInt(br.readLine());
                    System.out.print("Enter Position : ");
                    k=Integer.parseInt(br.readLine());
                    list=insertAtPos(list,n,k);
                    break;
                case 5 :
                    display(list);
                    System.out.println("\n");
                    break;
                case 6 :
                    list=delAtHead(list);
                    break;
                case 7 :
                    list=delAtTail(list);
                    break;
                case 8 :
                    System.out.print("\nEnter Key : ");
                    k=Integer.parseInt(br.readLine());
                    list=delTheKey(list,k);
                    break;
                case 9 :
                    System.out.print("\nEnter Position : ");
                    k=Integer.parseInt(br.readLine());
                    list=delAtPos(list,k);
                    break;
                case 10 :
                    System.out.println("\nLength of Your Linked List "+length(list));
                    break;
                case 11 :
                    System.out.println("\nEnter key :");
                    k=Integer.parseInt(br.readLine());
                    search(list, k);
                    break;
                case 12 :
                    list=reverse(list);
                    System.out.println("\nReversing is done");
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("Enter valid choice.");
            }
        }
        while(choice!=0);
        System.out.println("\nThank You for using my Linked List\n");
    }
}