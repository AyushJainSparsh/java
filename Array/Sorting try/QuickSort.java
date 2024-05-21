class QuickSort 
{
    void swap(int a[] , int i , int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void partition(int a[] , int i , int e)
    {
        if(i<e)
        {
            int pivot = pivot( a , i , e );
            partition( a , i , pivot-1 );
            partition( a , pivot+1 , e );
        }
    }

    int pivot( int a[] , int s , int e )
    {
        int pivot = a[e];
        int p = s-1;
        for(int i = s ; i<e ; i++ )
        {
            if(a[i]<pivot)
            {
                p++;
                swap( a , i , p );
            }
        }
        p++;
        swap( a , p , e );
        return p;
    }

    void display(int a[])
    {
        for(int i = 0 ; i < a.length ; i++)
        System.out.print(a[i]+"\t");
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int a[] = {8,2,6,4,5};
        int l = a.length;
        QuickSort qs = new QuickSort();
        System.out.println("Original Array : ");
        qs.display(a);
        qs.partition( a , 0 , l-1 );
        System.out.println("\n\nAfter Sorted : ");
        qs.display(a);
    }
}
