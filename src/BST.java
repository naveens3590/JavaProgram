/***
 * Find a value in BST Binary Search Tree
 * 			8
 * 		6			   21
 * 				  15		  28
 * 			 13		-1	  -1		-1
 *  
 * Find 21 in Tree - Ans True
*****/

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class BST {
public static void main(String[] args) {
	Node node=createNode();
	System.out.println("Node available in the tree?? :"+searchTreeSuccessor(node,9));
}

private static boolean searchTree(Node node, int i) {
	if(node==null) return false;
	
	if(node.data==i) {
		System.out.println("_______");
		return true;
	}
	
	if(i>node.data) {
		searchTree(node.right, i);
	}
	return searchTree(node.left, i);
}
private static int searchTreeSuccessor(Node node, int i) {
	TreeSet<Integer> set=new TreeSet<Integer>();
	if(node!=null)	{
		set.add(node.data);
	}
	
	if(node==null) return getLeastSuccesor(set,i);
	
	
	if(node.data==i) {
		searchTreeSuccessor(node.right, i);
	}
	searchTreeSuccessor(node.right, i);
	searchTreeSuccessor(node.left, i);
	 return getLeastSuccesor(set,i);
}

private static int getLeastSuccesor(TreeSet<Integer> set,int key) {
	Iterator<Integer> setIt = set.iterator();
	int temp=0;
	while(setIt.hasNext()) {
		if(setIt.next()>key &&temp<(setIt.next()/key)) {
			temp=setIt.next();
		}
	}
	return temp;
}

public static Node createNode() {
	Node root=null;
	System.out.print("Enter the data:\n");
	Scanner sc=new Scanner(System.in);
	int dt=sc.nextInt();
	if(dt==-1) return null;
	
	root=new Node(dt);
	
	System.out.println("Enter the left data of "+dt);
	root.left=createNode();
	System.out.println("Enter the right data of "+dt);
	root.right=createNode();
	
	return root;
}


public static class Node{
 Node left,right;
 int data;
 Node(int data){
 this.data=data;		
 }
}
}

