import java.util.*;
public class BstPractice {
	Node root;

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public Node insertData(Node root, int data) {
		if (root == null) {
			Node newNode = new Node(data);
			root = newNode;
		} else if (data <= root.data) {
			root.left = insertData(root.left, data);
		} else {
			root.right = insertData(root.right, data);
		}

		return root;

	}

	public void display(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new java.util.LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.peek();
			System.out.println(temp.data);
			if (temp.left != null) {
				q.add(temp.left);
			}

			if (temp.right != null) {
				q.add(temp.right);
			}

			q.remove();

		}
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}

	public void preorder(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);

	}

	public void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}

	public void printChild(Node root) {

		if (root == null)
			return;
		printChild(root.left);
		printChild(root.right);
		if (root.left == null && root.right == null) {
			System.out.println(root.data);
		}

	}

	public int maxValue(Node root) {
		if (root == null)
			return -1;
		Node current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current.data;

	}

	public int minValue(Node root) {
		if (root == null)
			return -1;
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;

	}

	int height(Node root) {
		if (root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	// Iterative search
	public void search(Node root, int data) {
		Node tempNode = root;
		while (tempNode != null) {
			if (tempNode.data == data) {
				System.out.println("Data found");
				return;
			} else if (data > tempNode.data) {
				tempNode = tempNode.right;
			} else {
				tempNode = tempNode.left;
			}
		}

		System.out.println("Not found");
		return;

	}

	public void printKDistant(Node root, int level)  
    { 
        if (root == null) 
            return; 
        if (level == 0)  
        { 
            System.out.print(root.data + " "); 
            return; 
        }  
        else 
        { 
            printKDistant(root.left, level - 1); 
            printKDistant(root.right, level - 1); 
        } 
    } 

	public static void main(String... agrs) {
		BstPractice bst = new BstPractice();
		bst.root = bst.insertData(bst.root, 50);
		bst.root = bst.insertData(bst.root, 30);
		bst.root = bst.insertData(bst.root, 20);
		bst.root = bst.insertData(bst.root, 40);
		bst.root = bst.insertData(bst.root, 70);
		bst.root = bst.insertData(bst.root, 60);
		bst.root = bst.insertData(bst.root, 80);
		System.out.println("Level order");
		bst.display(bst.root);
		System.out.println("Inorder");
		bst.inorder(bst.root);
		System.out.println("Preorder");
		bst.preorder(bst.root);
		System.out.println("Postorder");
		bst.postorder(bst.root);
		System.out.println("Child node");
		bst.printChild(bst.root);
		System.out.println("Max");
		System.out.println(bst.maxValue(bst.root));
		System.out.println("Min");
		System.out.println(bst.minValue(bst.root));

		System.out.println("Height");
		System.out.println(bst.height(bst.root));
		System.out.println("For search operation");
		bst.printKDistant(bst.root, 1);

	}

}
