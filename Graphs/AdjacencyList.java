/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class AdjacencyList
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj , int n, int m)
    {
        adj.get(n).add(m);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		///////Enter the no of vetices://///
		int v = sc.nextInt();
		int e = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
		int i;
		
		/////Enter the no of edges/////////
		for(i=0; i<v+1; i++)
		    adj.add(new ArrayList<Integer>());
		    
		for(i=0; i<e; i++)
		{
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    addEdge(adj,n,m);
		}
		
		for(i=0; i<v+1; i++)
		{
		    
		    for(int j = 0; j<adj.get(i).size(); j++)
		    {
		        System.out.println(i+" -> "+adj.get(i).get(j));
		    }
		}
	}
}
