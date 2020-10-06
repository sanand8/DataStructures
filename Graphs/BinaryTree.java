/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;


public class BinaryTree
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
    BinaryTree()
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
    void preorder(){
        preorderprint(root);
    }
    void preorderprint(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preorderprint(root.left);
            preorderprint(root.right);
        }
    }
    void post()
    {
        postorder(root);
        
    }
    void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    BinaryTree tree = new BinaryTree();
	    for(int i=0; i<n; i++)
	    {
	        int x = sc.nextInt();
	        tree.Insert(x);
	    }
	    tree.inorder();
	    System.out.println("it was the inorder");
	    tree.preorder();
	    System.out.println("it was the preorder");
	    tree.post();
	}
}
