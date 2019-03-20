import java.util.LinkedList;

public class GraphImp {

	static class Graph {

		int V;
		LinkedList<Integer> adjlist[];

		public Graph(int v) {
			V = v;
			adjlist = new LinkedList[V];
			for (int i = 0; i < V; i++) {
				adjlist[i] = new LinkedList<>();
			}
		}

	}

	static void addedges(Graph g, int src, int dst) {
		g.adjlist[src].add(dst);
		g.adjlist[dst].add(src);
	}

	static void printGraph(Graph g) {
		for (int i = 0; i < g.V; i++) {
			System.out.println("Adjacency list of vertex " + i);
			System.out.print("head");
			for (Integer adj : g.adjlist[i]) {
				System.out.print(" ->" + adj);

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int v = 6;
		Graph g = new Graph(v);
		addedges(g, 0, 1);
		addedges(g, 0, 3);
		addedges(g, 0, 5);
		addedges(g, 1, 2);
		addedges(g, 2, 3);
		addedges(g, 3, 4);
		addedges(g, 4, 5);
		printGraph(g);

	}

}
