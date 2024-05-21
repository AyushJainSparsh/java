/*
 * Input :- {2,3,5,7,7,7,7,9,10}
 *          key = 7
 * Output :- 3 , 6
 */

import java.util.Arrays;
import java.util.Scanner;
class demo
{
    public static void main(String[] args) 
    {
        System.out.println("Hello! World");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int l = sc.nextInt();
        int a[] = new int[l];
        Arrays.sort(a);

        System.out.println("Enter Array Elements :");
        for(int i = 0 ; i < l ; i++)
        a[i] = sc.nextInt();

        System.out.println("Enter Key Element :");
        int key = sc.nextInt();

        int begin = 0;
        int end = a.length-1;
        int s=-1;
        int e=-1;

        W : while(begin<=end)
        {
            int mid = (begin+end)/2;
            if(a[mid] == key)
            {
                int i;
                A : for(i = mid ; i>=begin ; i--)
                {
                    if(a[i] != key)
                    break A;
                }
                s = i+1;
                B : for(i = mid ; i<=end ; i++)
                {
                    if(a[i] != key)
                    break B;
                }
                e = i-1;
                break W;
            }
            else if(a[mid]>key)
            end = mid-1;
            else
            begin = mid+1;
        }

        if(s==-1)
        System.out.println("{ -1 , -1 }");
        else
        System.out.println("{ "+s+" , "+e+" }");
    }
}