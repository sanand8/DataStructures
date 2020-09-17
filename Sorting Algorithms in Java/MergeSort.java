/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class MergeSort
{
    void Merge(int l, int m, int r, int []a)
    {
        int n1 = m - l + 1;
        int n2 = r - m; 
        int []L = new int[n1];
        int []R = new int[n2];
        
        int i=0,j=0;
        for(i=0; i<n1; i++)
            L[i] = a[l + i];
        for(j=0; j<n2; j++)
            R[j] = a[m + 1 + j];
        i = 0;
        j = 0;
        int k = l;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }
        while(j < n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    
    void Sort(int l, int r, int[]a)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            Sort(l,m,a);
            Sort(m+1,r,a);
            Merge(l,m,r,a);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		int i;
		for(i=0; i<n; i++)
		    a[i] = sc.nextInt();
		MergeSort m = new MergeSort();
	    m.Sort(0,n-1,a);
		for(i=0; i<n; i++)
		    System.out.println(a[i]);
	}
}
