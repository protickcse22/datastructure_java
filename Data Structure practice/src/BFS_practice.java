import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_practice {

	static class Graph {

		int vertices;
		LinkedList<Integer> adjlist[];

		public Graph(int v) {
			this.vertices = v;
			adjlist = new LinkedList[this.vertices];
			for (int i = 0; i < v; i++) {
				adjlist[i] = new LinkedList<>();
			}
		}
	}

	public static void addEdge(Graph g, int src, int dst) {
		g.adjlist[src].add(dst);
		 g.adjlist[dst].add(src);
	}

	public static void BFS(Graph g, int src) {
		boolean[] visited = new boolean[g.vertices];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(src);
		visited[src] = true;
		while (!q.isEmpty()) {
			src = q.peek();
			System.out.println(src + " ");
			q.remove();
			Iterator<Integer> itr = g.adjlist[src].listIterator();
			while (itr.hasNext()) {
				int n = itr.next();
				if (!visited[n]) {
					visited[n] = true;
					q.add(n);
				}

			}
		}
	}

	public static void main(String[] args) {
		int v = 6;
		Graph g = new Graph(v);
		addEdge(g, 0, 1);
		addEdge(g, 0, 2);
		addEdge(g, 0, 3);
		addEdge(g, 0, 4);
		addEdge(g, 1, 4);
		addEdge(g, 1, 5);
		addEdge(g, 2, 3);
		addEdge(g, 3, 4);
		addEdge(g, 4, 5);

		BFS(g, 2);

	}

}
