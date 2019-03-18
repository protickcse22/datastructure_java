class QueueImp<T> {

	public int front, rare, size;
	public T arr[];

	@SuppressWarnings("unchecked")
	public QueueImp(int size) {
		this.front = 0;
		this.rare = 0;
		this.size = size;
		arr = (T[]) new Object[size + 1];

	}

	public void enqueue(T item) {
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}
		arr[this.rare] = item;
		this.rare = (this.rare + 1) % (this.size + 1);

	}

	public T dequeue() {
		if (isEmpty())
			return null;
		T item = arr[this.front];
		this.front = (this.front + 1) % (this.size + 1);
		return item;
	}

	public boolean isFull() {
		return (this.rare + 1) % (this.size + 1) == this.front;
	}

	public boolean isEmpty() {
		return this.front == this.rare;
	}

	public T peek() {
		if (!isEmpty()) {
			return arr[this.front];
		} else {
			return null;
		}

	}

}

public class QueueImplementation {

	public static void main(String[] args) {

		QueueImp<Integer> q = new QueueImp<Integer>(5);
		q.enqueue(10);
		System.out.println("Rare = " + q.rare);
		q.enqueue(20);
		System.out.println("Rare = " + q.rare);
		q.enqueue(30);
		System.out.println("Rare = " + q.rare);
		q.enqueue(40);
		System.out.println("Rare = " + q.rare);
		q.enqueue(50);
		System.out.println("Rare = " + q.rare);
		q.dequeue();
		System.out.println("Front = " + q.front);
		q.dequeue();
		System.out.println("Front = " + q.front);
		q.dequeue();
		System.out.println("Front = " + q.front);
		q.enqueue(33);
		System.out.println("Rare = " + q.rare);
		q.enqueue(55);
		System.out.println("Rare = " + q.rare);

		System.out.println(q.peek());

	}

}
