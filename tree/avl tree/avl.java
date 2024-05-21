import java.io.*;
class avl
{
    static class node
    {
        int data,height;
        node left ,right;
        node(int val)
        {
            data=val;
            height=1;
        }
    }

    node root;
    int height(node root)
    {
        if(root==null)
        return 0;
        return root.height;
    }

    int max(int a,int b)
    {
        return (a>b)?a:b;
    }

    node leftRotation(node root)
    {
        node l=root.left;
        node lr=l.right;
        l.right=root;
        root.left=lr;
        root.height=max(height(root.left), height(root.right))+1;
        l.height=max(height(l.left), height(l.right));
        return l;
    }

    node rightRotation(node root)
    {
        node r=root.right;
        node rl=r.left;
        r.left=root;
        root.right=rl;
        root.height=max(height(root.left),height(root.right))+1;
        r.height=max(height(r.left),height(r.right));
        return r;
    }

    int getBalance(node root)
    {
        if(root==null)
        return 0;
        return height(root.left)-height(root.right);
    }

    node insert(node root,int val)
    {
        if(root == null)
            return (new node(val));
        if(val<root.data)
            root.left=insert(root.left,val);
        else if(val>root.data)
            root.right=insert(root.right,val);
        else
            return root;
        root.height=1+max(height(root.left),height(root.right));
        int bal=getBalance(root);
        if(bal>1 && val < root.left.data)
            return leftRotation(root);
        if(bal<-1 && val > root.right.data)
            return rightRotation(root);
        if(bal>1 && val > root.left.data)
        {
            root.left=rightRotation(root.left);
            return leftRotation(root);
        }
        if(bal<-1 && val < root.right.data)
        {
            root.right=leftRotation(root.right);
            return rightRotation(root);
        }
        return root;
    }

    void preorder(node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args)throws IOException
    {
        avl a=new avl();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        do
        {
            System.out.println("\nEnter :\n1.Enter Element");
            System.out.println("2.Inorder\n3.Preorder");
            System.out.println("0.Exit");
            choice=Integer.parseInt(br.readLine());
            switch (choice) 
            {
                case 1 :
                    System.out.println("\nEnter Element :");
                    int n=Integer.parseInt(br.readLine());
                    a.root=a.insert(a.root, n);
                    break;
                case 2 :
                    System.out.println("\nInorder Traversal :");
                    a.inorder(a.root);
                    System.out.println();
                    break; 
                case 3 :
                    System.out.println("\nPreorder Traversal :");
                    a.preorder(a.root);
                    System.out.println();
                    break;
                case 0 :
                    System.out.println("\nSuccessfully  Exited");
                    break; 
                default:
                    System.out.println("\nEnter Valid Choice");
            }
        }
        while(choice!=0);
        System.out.println("\n\nThank You\n");
    }
}
