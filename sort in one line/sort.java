import java.util.Arrays;
class sort
{
    public static void main(String[] args) {
        int[] a = {55,35,68,14,5,566,11,55};
        for( int i : a)
        System.out.print( i +"\t");
        Arrays.sort(a);
        System.out.println();
        for( int i : a)
        System.out.print( i +"\t");
    }
}