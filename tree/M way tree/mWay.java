import java.util.*;
class mWay 
{
    int c;
    static class node
    {
        mWay m=new mWay();
        int data[]=new int[m.c];
        node edge[]=new int[m.c+1];
        node(int val,int pos)
        {
            data[pos]=val;
            edge[pos]=null;
            edge[pos+1]=null;
        }
    }    
    
    static node root;

    int position()
    {
        int pos;
        for(pos=0;pos<c;pos++)
        {
            if(root.data[i]==0)
            break;
        }
        return pos;
    }

    void insert(int val)
    {
        int pos=position();
        root.data[pos]=new node(val,pos);
    }

    void display()
    {
        
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        mWay m=new mWay();
        System.out.println("Enter Child of mWay Tree");
        m.c=sc.nextInt();
        m.insert(5);
        m.insert(56);
        m.insert(34);
        m.display();
        sc.close();
    }
}
