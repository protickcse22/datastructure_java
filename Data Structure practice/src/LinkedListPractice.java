
public final class LinkedListPractice {
	static Node head;

	static class Node<T> {
		T data;
		Node link;

		public Node(T data) {
			this.data = data;
			this.link = null;
		}
	}

	public static <T> void insertNodeHead(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.link = head;
			head = newNode;
		}
	}

	public static <T> void insertNodepos(T data, int pos) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node tempNode = head;
			for (int i = 0; i < pos - 2; i++) {
				tempNode = tempNode.link;
			}
			newNode.link = tempNode.link;
			tempNode.link = newNode;

		}
	}

	public static <T> void insertNodelast(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node tempNode = head;
			while (tempNode.link != null) {
				tempNode = tempNode.link;
			}
			tempNode.link = newNode;

		}
	}

	public static void reverseList() {
		Node prevNode = null;
		Node currNode = head;
		Node nextNode = null;

		while (currNode != null) {
			nextNode = currNode.link;
			currNode.link = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;

	}

	public static void deleteHeadNode() {
		if (head == null)
			return;
		head = head.link;
	}

	public static void printInfo() {
		if (head == null)
			return;
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}

	public static void delPosNode(int pos) {
		if (head == null)
			return;
		Node currentNode = head;
		Node nextNode = head.link;
		for (int i = 0; i < pos - 2; i++) {
			currentNode = nextNode;
			nextNode = nextNode.link;
		}
		currentNode.link = nextNode.link;
	}

	public static void delLastNode() {
		if (head == null)
			return;
		Node currentNode = head;
		Node nextNode = head.link;
		while (nextNode.link != null) {
			currentNode = nextNode;
			nextNode = nextNode.link;
		}
		currentNode.link = null;
	}

	public static void main(String[] args) {
//		LinkedListPractice list = new LinkedListPractice();
		insertNodelast("Protick");
		insertNodelast(20);
		insertNodelast(30);
		insertNodelast(40);
		insertNodepos(25, 2);
		insertNodelast(60);
		printInfo();
		System.out.println("Delete head node");
//		reverseList();
//		printInfo();
		deleteHeadNode();
		printInfo();

	}

}
