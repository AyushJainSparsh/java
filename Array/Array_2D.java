class Array_2D
{

    int[] insertionSort( int a[] )
    {
        int n=a.length;
        System.out.println();
        for(int i=1;i<n;i++)
        {
            int key=a[i];
            int j=i-1;
            while (j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        return a;
    }

    void display(int a[][])
    {
        for( int i = 0 ; i<a.length ; i++ )
        {
            for(int j = 0 ; j<a[0].length ; j++ )
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int r = 3 , c = 3 ;
        int a[][]={{8,2,5},{7,1,4},{9,1,5}};
        int ar[]=new int[r*c];
        int k=0;
        for(int i = 0; i<r ; i++)
        {
            for(int j = 0 ; j<c ; j++ )
                ar[k++]=a[i][j];
        }
        Array_2D array_2d = new Array_2D();
        System.out.println("Input :");
        array_2d.display(a);
        ar = array_2d.insertionSort(ar);
        k=0;
        for(int i = 0;i<r ; i++ )
        {
            for(int j = 0 ; j<c ; j++ )
            a[i][j]=ar[k++];
        }
        System.out.println("\nOutput : ");
        array_2d.display(a);
    }
}
