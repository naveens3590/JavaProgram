/***
 * Find floor and ceil value in BST Binary Search Tree
 * 			8
 * 		6			   21
 * 				  15		  28
 * 			 13		-1	  -1		-1
 * 
 * FLOOR IS THE LOWER THAN KEY AND  GREATER OF THEM
 * CEIL IS THE HIGHER THAN KEY AND LOWER OF THEM  
 * IF KEY IS 16 FLOOR=15 AND CEIL=21
*****/

import java.util.Scanner;

public class BSTFloorCeil {
public static void main(String[] args) {
	Node node=createNode();
	System.out.println("Floor value :"+floor(node,16));
	System.out.println("Ceil value :"+ceil(node,16));
}

private static int floor(Node node, int key) {
	int ans=Integer.MAX_VALUE;
	
	while(node!=null) {
		if(node.data==key) return node.data;
		
		if(node.data>key) {
			node=node.left;
		}else {
			ans=node.data;
			node=node.right;
		}
		
	}
	return ans;
}
private static int ceil(Node node, int key) {
	int ans=Integer.MIN_VALUE;
	
	while(node!=null) {
		if(node.data==key) return node.data;
		
		if(node.data>key) {
			ans=node.data;
			node=node.left;
		}else {
			
			node=node.right;
		}
		
	}
	return ans;
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

