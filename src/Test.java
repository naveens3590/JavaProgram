import java.util.Scanner;

class Test{
	
	public static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean searchNode(Node node, int data) {

		if (node.data == data)
			return true;

		if (data < node.data)
			searchNode(node.left, data);

		return searchNode(node.right, data);
	}


	public static Node createNode() {

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		if (data == -1)
			return null;

		Node root = new Node(data);

		root.left = createNode();
		root.right = createNode();

		return root;
	}

	public static void main(String[] arg) {

		createNode();

	}

}