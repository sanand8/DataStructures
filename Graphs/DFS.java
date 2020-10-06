/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class DFS
{
    static void addedge(ArrayList<ArrayList<Integer>>list,int v,int u)
    {
        list.get(v).add(u);
        list.get(u).add(v);
    }
    static void print(ArrayList<ArrayList<Integer>>list)
    {
        
        int i,j=0;
        for(i=0; i<list.size(); i++)
        {
            for(j=0; j<list.get(i).size(); j++)
                System.out.print(list.get(i).get(j)+" ");
            System.out.println("");
        }
    }
    
    //////DFS code goes here./////////
    static void dfs(ArrayList<ArrayList<Integer>>list,int start,int[] visited)
    {
        System.out.println(start);
        visited[start] = 1;
        
        for(int j=0; j<list.get(start).size();j++)
        {
            int x = list.get(start).get(j);
            if(visited[x]!=1)
            {
                dfs(list,x,visited);
            }
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int n = sc.nextInt();
		System.out.println("Enter the no of edges");
		int e = sc.nextInt();
		int i;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(i=0; i<=n; i++)
		{
		    list.add(new ArrayList<>());
		}
		for(i=0; i<e; i++)
		{
		    int v = sc.nextInt();
		    int u = sc.nextInt();
		    addedge(list,v,u);
		}
		int []visit = new int[n+1];
		int start = 1;
		dfs(list,start,visit);
		print(list);
	}
}
