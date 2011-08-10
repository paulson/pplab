//BinTree.java
//demonstrates binary tree
//to run this program : java BinTree
//date :2011/07/14
import java.io.*;
class BinTree
{
	class BinNode
	{
		int info;
		BinNode left;
		BinNode right;
		BinNode(int v)
		{
			info=v;
		}
	}
	public void start()throws IOException
	{
		System.out.println("Enter the root");
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		String s=ds.readLine();
		int n=Integer.parseInt(s);
		BinNode root=new BinNode(n);
		insert(root);
		System.out.println("Inorder traverse");
		inorder(root);
		System.out.println(" ");
		System.out.println("Preorder traverse");
		preorder(root);
		System.out.println(" ");
		System.out.println("Postorder traverse");
		postorder(root);
		System.out.println(" ");
		int x=depth(root);
		System.out.println("Depth:"+(x-1));
	}
	public static void main(String args[]) throws IOException
	{
		BinTree b=new BinTree();
		b.start();
	}
	public void insert(BinNode r) throws IOException
	{     
		BufferedReader ds=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want to insert a left subtree at{"+r.info+"}:(y/n)");
		String s=ds.readLine();
		if(s.equals("y") )
		{
			System.out.println("Enter the value");
			int n=Integer.parseInt(ds.readLine());
			r.left=new BinNode(n);
			insert(r.left);
		}
		System.out.println("Do you want to insert a right subtree at{"+r.info+"}:(y/n)");
		s=ds.readLine();
		if(s.equals("y"))
		{
			System.out.println("Enter the value");
			int n=Integer.parseInt(ds.readLine());
			r.right=new BinNode(n);
			insert(r.right);
		}
	}
	public void preorder(BinNode r)
	{
		if(r!=null)
		{
			System.out.print("{"+r.info+"}\t ");
			preorder(r.left);
			preorder(r.right);
		}
	}
	public void postorder(BinNode r)
	{
		if(r!=null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.print("{"+r.info+"}\t ");
		}
	}
	public void inorder(BinNode r)
	{
		if(r!=null)
		{
			inorder(r.left); 
			System.out.print("{"+r.info+"}\t ");
			inorder(r.right);
		}
	}
	public int depth(BinNode r)
	{
		int d1,d2;
		if(r==null)
			return(0);
		d1=depth(r.left);
		d2=depth(r.right);
		return(d1>d2?d1+1:d2+1);
	}
}
/*
   OUTPUT
   ------
   paulson@paulson-Inspiron-1525:~/pplab/2/BinTree$ javac BinTree.java 
   paulson@paulson-Inspiron-1525:~/pplab/2/BinTree$ java BinTree 
   Enter the root
   4
   Do you want to insert a left subtree at{4}:(y/n)
   y
   Enter the value
   5
   Do you want to insert a left subtree at{5}:(y/n)
   y
   Enter the value
   3
   Do you want to insert a left subtree at{3}:(y/n)
   y
   Enter the value
   8
   Do you want to insert a left subtree at{8}:(y/n)
   n
   Do you want to insert a right subtree at{8}:(y/n)
   n
   Do you want to insert a right subtree at{3}:(y/n)
   y
   Enter the value
   7
   Do you want to insert a left subtree at{7}:(y/n)
   n
   Do you want to insert a right subtree at{7}:(y/n)
   n
   Do you want to insert a right subtree at{5}:(y/n)
   y
   Enter the value
   2
   Do you want to insert a left subtree at{2}:(y/n)
   n
   Do you want to insert a right subtree at{2}:(y/n)
   n
   Do you want to insert a right subtree at{4}:(y/n)
   y
   Enter the value
   9
   Do you want to insert a left subtree at{9}:(y/n)
   y
   Enter the value
   1
   Do you want to insert a left subtree at{1}:(y/n)
   n
   Do you want to insert a right subtree at{1}:(y/n)
   n
   Do you want to insert a right subtree at{9}:(y/n)
   y
   Enter the value
   6
   Do you want to insert a left subtree at{6}:(y/n)
   n
   Do you want to insert a right subtree at{6}:(y/n)
   n
   Inorder traverse
   {8}	 {3}	 {7}	 {5}	 {2}	 {4}	 {1}	 {9}	 {6}	  
   Preorder traverse
   {4}	 {5}	 {3}	 {8}	 {7}	 {2}	 {9}	 {1}	 {6}	  
   Postorder traverse
   {8}	 {7}	 {3}	 {2}	 {5}	 {1}	 {6}	 {9}	 {4}	  
   Depth:3
 */
