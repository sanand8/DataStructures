/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;


public class DeleteNode
{
    class Node{
    int data;
    Node left,right;
    
    public Node(int num)
    {
        data = num;
        left = null;
        right = null;
    }
}

    Node root;
    DeleteNode()
    {
        root = null;
    }
    void Insert(int x)
    {
        root = Insertion(root,x);
    }
    Node Insertion(Node root,int x)
    {
        if(root == null)
        {
            root = new Node(x);
            return root;
            
        }
        else if(root.data > x)
        {
            root.left = Insertion(root.left,x);
        }
        else 
            root.right = Insertion(root.right,x);
        return root;
    }
    
    void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.data); 
            inorderRec(root.right); 
        } 
    }
    
    void delete(int x)
    {
        deleteNode(root,x);
    }
    Node deleteNode(Node root, int x)
    {
        if(root == null)
            return root;
        else if(root.data > x)
            root.left = deleteNode(root.left,x);
        
        else if(root.data < x)
            root.right = deleteNode(root.right,x);
        
        else
        {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
                
            root.data = min(root.right);
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }
    int min(Node root)
    {
        int minvalue = root.data;
        while(root != null)
        {
            minvalue = root.data;
            root = root.left;
        }
        return minvalue;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    DeleteNode tree = new DeleteNode();
	    for(int i=0; i<n; i++)
	    {
	        int x = sc.nextInt();
	        tree.Insert(x);
	    }
	    tree.inorder();
	    System.out.println("it was the inorder");
	   // tree.preorder();
	   // System.out.println("it was the preorder");
	   // tree.post();
	    System.out.println("Enter the element you wanna delete");
	    int x = sc.nextInt();
	    tree.delete(x);
	    tree.inorder();
	}
}
