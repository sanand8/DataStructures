/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class InsertionSort
{
    public static int[] InsetionSort(int []a)
    {
        int n = a.length;
        int key,j,i;
		for(i=1; i<n; i++)
		{
		    key = a[i];
		    j = i - 1;
		    while(j >= 0 && a[j] > key)
		    {
		        a[j+1] = a[j];
		        j = j - 1;
		    }
		    a[j+1] = key;
		}
		return a;  
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("///////////Enter the size of array////////");
		int n = sc.nextInt();
		int i;
		int []a = new int[n];
		System.out.println("//////////////Enter the elements/////////");
		for(i=0; i<n; i++)
		    a[i] = sc.nextInt();
		InsetionSort(a);
		for(i=0; i<n; i++)
		    System.out.print(a[i]+" ");
	}
}
