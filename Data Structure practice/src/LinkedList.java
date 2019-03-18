public class LinkedList<T> {
	Node<T> head;

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
		newNode.next = null;
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
			
			for(int i=0;i<pos-2;i++)
			{
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
		}

	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.insertNode(list, "protick");
		list.insertNode(list, "Reza");
		list.insertNode(list, "Shovon");
		list.insertNodePos(list, "Hello", 2);
		list.traverseList(list);

	}

}
