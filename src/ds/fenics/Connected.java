package ds.fenics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * @author Prema
 *
 */
public class Connected {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File(args[0]));
		// passing the scanner object to graph class to construct the graph
		Graph graph = Graph.readGraph(in);
		if (graph.vertex.get(args[1]) == null || graph.vertex.get(args[2]) == null)
			System.out.println("no");
		else
			System.out.println(dfsVisit(graph.vertex.get(args[1]), args[2]) ? "yes" : "no");
	}

	/**
	 * @param u
	 * @param vertex
	 */
	public static boolean dfsVisit(Graph.Vertex u, String dest) {
		u.seen = true;
		for (Graph.Edge e : u) {
			Graph.Vertex v = e.otherEnd(u);
			if (!v.seen) {
				if (v.name.equals(dest) || (dfsVisit(v, dest)))
					return true;
			}
		}
		return false;
	}
}
