// utility class for Linkedlist
public class LinkedList<T> {
	// Declaring Head node
	Node<T> head;
	int size = 0;

	// utility class for Node
	static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

	public LinkedList<T> insertNode(LinkedList<T> list, T data) {
		// creating a new Node
		Node<T> newNode = new Node<T>(data);
		// newNode.next = null;
		// Insert node at the beginning of the list
		if (list.head == null) {
			list.head = newNode;
		}

		// Insert node at end of the list
		else {
			Node<T> temp = list.head;
			while (temp.next != null) {
				temp = (Node<T>) temp.next;
			}

			temp.next = newNode;
		}

		return list;
	}

	public LinkedList<T> insertNodePos(LinkedList<T> list, T data, int pos) {
		// creating a new Node
		Node<T> newNode = new Node<T>(data);
		newNode.next = null;
		// Insert node at the beginning of the list
		if (list.head == null) {
			list.head = newNode;
		}

		// Insert node at end of the list
		else {
			Node<T> temp = list.head;

			for (int i = 0; i < pos - 2; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;

		}

		return list;
	}

	public void traverseList(LinkedList<T> list) {
		Node<T> temp = (Node<T>) list.head;
		while (temp != null) {
			System.out.println("Data: " + temp.data);
			temp = (Node<T>) temp.next;
			size++;
		}

	}

	/*
	 * public void LinkedListSort(LinkedList<T> list) {
	 * 
	 * if (size > 1) { for (int i = 0; i < size; i++) { Node<T> current =
	 * list.head; Node<T> next = list.head.next; for (int j = 0; j < size - 1;
	 * j++) { if (current.data > next.data) { Node<T> temp = current; current =
	 * next; next = temp; } current = next; next = next.next; } } }
	 * 
	 * }
	 */

	public void deleteHeadNode(LinkedList<T> list) {
		list.head = list.head.next;
	}

	public void deleteLastNode(LinkedList<T> list) {
		Node<T> prevNode = list.head;
		Node<T> nextNode = list.head.next;
		while (nextNode.next != null) {
			prevNode = nextNode;
			nextNode = nextNode.next;
		}
		prevNode.next = null;
	}

	public void deleteposNode(LinkedList<T> list, int pos) {

		Node<T> prevNode, nextNode;
		prevNode = list.head;
		nextNode = list.head.next;

		for (int i = 0; i < pos - 2; i++) {
			prevNode = nextNode;
			nextNode = nextNode.next;
		}
		prevNode.next = nextNode.next;

	}

	public LinkedList<T> reverserList(LinkedList<T> list) {

		Node<T> prev, current, next;
		prev = null;
		current = list.head;
		next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list.head = prev;

		return list;

	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.insertNode(list, "protick");
		list.insertNode(list, "Reza");
		list.insertNode(list, "Shovon");
		list.insertNodePos(list, "Hello", 2);
		list.insertNodePos(list, "Sami", 3);
		list.insertNodePos(list, "Munna", 2);
		list.traverseList(list);
		System.out.println("Size " + list.size);
		System.out.println("\n\n");
		// list.deleteLastNode(list);
		list.deleteposNode(list, 3);
		list.traverseList(list);
		list.reverserList(list);
		System.out.println("\n\n");
		list.traverseList(list);

	}

}
