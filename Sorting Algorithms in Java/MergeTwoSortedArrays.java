/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class MergeTwoSortedArrays
{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]a = new int[n];
		int[]b = new int[m];
		int i;
		for(i=0; i<n; i++)
		    a[i] = sc.nextInt();
		for(i=0; i<m; i++)
		    b[i] = sc.nextInt();
		int []c = new int[m+n];
		int k = 0;
		i = 0;
		int j = 0;
		while(i<n && j<m)
		{
		    if(a[i] <= b[j])
		    {
		        c[k] = a[i];
		        i++;
		    }
		    else
		    {
		        c[k] = b[j];
		        j++;
		    }
		    k++;
		}
		
		while(i<n)
		{
		    c[k] = a[i];
		    i++;
		    k++;
		}
		while(j<m)
		{
		    c[k] = b[j];
		    j++;
		    k++;
		}
		for(i=0; i<(m+n); i++)
		    System.out.print(c[i]+" ");
		
	}
}
