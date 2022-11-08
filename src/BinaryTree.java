/***
 * Create a Binary Tree and travers inorder,preorder and postorder
 * 			8
 * 		6			   21
 * 				  15		  28
 * 			 13		-1	  -1		-1
 *  
 * InOrder LNR -6 8 13 15 21 28
 * PreOrder NLR- 8 6 21 15 13 28
 * PostOrder LRN- 6 13 15 28 21 8
*****/

import java.util.Scanner;

public class BinaryTree {
public static void main(String[] args) {
	System.out.println();
	Node node=createNode();
	inOrder(node);//Left,root,Right
	preOrder(node);//root,left,right
	postOrder(node);//left,right,root
}
private static void postOrder(Node root) {
		if(root==null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" " );
}
private static void preOrder(Node root) {
		if(root==null) return;
		
		System.out.print(root.data+" " );
		preOrder(root.left);
		preOrder(root.right);
}
private static void inOrder(Node root) {
	if(root==null) return;
	
	inOrder(root.left);
	System.out.print(root.data+" " );
	inOrder(root.right);
	
}
public static Node createNode() {
	Node root=null;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the data:");
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
