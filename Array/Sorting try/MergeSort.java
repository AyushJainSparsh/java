class MergeSort
{
    int a[]={8,2,6,4,5,7,3,9,1};
    void display()
    {
        for(int i=0 ; i<a.length ; i++)
        System.out.print(a[i]+"\t");
    }

    void divide(int i,int e)
    {
        if(i<e)
        {
            int m=i+(e-i)/2;
            divide(i,m);
            divide(m+1,e);
            conquer(i,m,e);
        }
    }
    
    void conquer( int i , int m , int e)
    {
        int s1=m-i+1 , s2=e-m;
        int a1[]=new int[s1];
        int a2[]=new int[s2];
        for(int j=0;j<s1;j++)
        a1[j]=a[i+j];
        for(int j=0;j<s2;j++)
        a2[j]=a[m+j+1];
        
        int i1=0,i2=0;
        while(i1<s1 && i2<s2)
        {
            if(a1[i1]<a2[i2])
            a[i++]=a1[i1++];
            else
            a[i++]=a2[i2++];
        }
        while(i1<s1)
        a[i++]=a1[i1++];
        while(i2<s2)
        a[i++]=a2[i2++];
    }

    public static void main(String[] args) 
    {
        MergeSort ms=new MergeSort();
        System.out.println("Original Array :");
        ms.display();
        ms.divide(0,ms.a.length-1);
        System.out.println("\nSorted Array :");
        ms.display();
    }
}