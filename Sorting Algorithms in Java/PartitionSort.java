/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class PartitionSort
{
    int Partition(int l, int h, int[]a)
    {
        int pivot = a[h];
        int i = l - 1;
        for(int j = l; j<h; j++)
        {
            if(a[j] < pivot)
            {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[h];
        a[h] = a[i+1];
        a[i+1] = temp;
        return i+1;
    }
    void Sort(int l, int h, int[] a)
    {
        if(l < h)
        {
            int part = Partition(l,h,a);
            Sort(l,part-1,a);
            Sort(part,h,a);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[]a = new int[n];
		
		int i;
		for(i=0; i<n; i++)
		    a[i] = sc.nextInt();
		
		PartitionSort m = new PartitionSort();
		m.Sort(0,n-1,a);
		for(i=0; i<n; i++)
		    System.out.println(a[i]);
		
	}
}
