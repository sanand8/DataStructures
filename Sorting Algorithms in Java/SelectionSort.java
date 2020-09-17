/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class SelectionSort
{
    public static int[] SelecltonSort(int []a)
    {
          int n = a.length;
          int i,j;
          for(i=0; i<n-1; i++)
          {
              int min = i;
              for(j=i+1; j<n; j++)
              {
                  if(a[j] < a[min])
                    min = j;
              }
              int temp = a[min];
              a[min] = a[i];
              a[i] = temp;
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
		SelecltonSort(a);
		System.out.println("The sorted order is :-");
		for(i=0; i<n; i++)
		    System.out.print(a[i]+" ");
	}
}
