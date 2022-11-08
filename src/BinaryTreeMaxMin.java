/***
 * Create a Binary Tree and find the maximum and minimum of it
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

public class BinaryTreeMaxMin {
public static void main(String[] args) {
	System.out.println();
	Node node=createNode();
	System.out.println("Max Value of Node:"+maximum(node));
	System.out.println("Min Value of Node:"+minimum(node));
}
private static int minimum(Node node) {
	if(node==null)return 0;
	
	return Math.min(node.data, Math.min(minimum(node.left),minimum(node.right)));
}
private static int maximum(Node node) {
	if(node==null)return 0;
	
	return Math.max(node.data, Math.max(maximum(node.left),maximum(node.right)));
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
