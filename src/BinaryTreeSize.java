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

public class BinaryTreeSize {
public static void main(String[] args) {
	System.out.println();
	Node node=createNode();
	//int[] array=new int[] {-10,-3,0,5,9};
	System.out.println(size(node));
}

private static int size(Node node) {
	
	if(node==null)return 0;
	
	return size(node.left)+size(node.right)+1;
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
