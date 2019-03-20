public class Treepractice<T> {
	Node<T> root;

	static class Node<T> {
		T data;
		Node left;
		Node right;

		public Node(T data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public Treepractice<T> InsertNode(Treepractice<T> list, T data) {
		
		Node<T> newNode = new Node<T>(data);
//		if (root == null)
		
		
		return list;
	
	}

	public static void main(String[] args) {

	}

}
