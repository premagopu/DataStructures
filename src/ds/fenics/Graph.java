package ds.fenics;

import java.util.*;

public class Graph {
	HashMap<String, Vertex> vertex; // vertices of graph
	public int n; // number of vertices in the graph

	/**
	 * Nested class to represent a vertex of a graph
	 */

	public static class Vertex implements Iterable<Edge> {
		String name; // name of the vertex
		public List<Edge> adj; // adjacency list; use LinkedList or
		public boolean seen; // ArrayList

		/**
		 * Constructor for vertex
		 *
		 * @param n
		 *            : int - name of the vertex
		 */
		public Vertex(String n) {
			name = n;
			adj = new LinkedList<Edge>();
			seen = false;
		}

		/**
		 * Method to get name of a vertex.
		 *
		 */
		public String getName() {
			return name;
		}

		/**
		 * name of vertex is unique, so use that to implement equals
		 */
		@Override
		public boolean equals(Object other) {
			Vertex otherVertex = (Vertex) other;
			if (otherVertex == null) {
				return false;
			}
			return this.name.equals(otherVertex.name);
		}

		/** Iterator to go through edges out of vertex */
		public Iterator<Edge> iterator() {
			return adj.iterator();
		}

		public String toString() {
			return name;
		}
	}

	/**
	 * Nested class that represents an edge of a Graph
	 */

	public static class Edge {
		public Vertex from; // head vertex
		public Vertex to; // tail vertex
		public boolean seen;

		/**
		 * Constructor for Edge
		 *
		 * @param u
		 *            : Vertex - Vertex from which edge starts
		 * @param v
		 *            : Vertex - Vertex on which edge lands
		 * @param w
		 *            : int - Weight of edge
		 */
		public Edge(Vertex u, Vertex v) {
			from = u;
			to = v;
			seen = false; // compatibility
		}

		/** Method to get vertex incident to edge at "from" end */
		public Vertex fromVertex() {
			return from;
		}

		/** Method to get vertex incident to edge at "to" end */
		public Vertex toVertex() {
			return to;
		}

		/**
		 * Method to find the other end end of an edge, given a vertex reference This
		 * method is used for undirected graphs
		 *
		 * @param u
		 *            : Vertex
		 * @return : Vertex - other end of edge
		 */
		public Vertex otherEnd(Vertex u) {
			assert from.equals(u) || to.equals(u);
			// if the vertex u is the head of the arc, then return the tail else
			// return the head
			if (from.equals(u)) {
				return to;
			} else {
				return from;
			}
		}

		/** Edges are equal if they have the same name and connect same ends */
		@Override
		public boolean equals(Object other) {
			if (other == null) {
				return false;
			}
			Edge otherEdge = (Edge) other;
			return this.from.equals(otherEdge.from) && this.to.equals(otherEdge.to);
		}

		/**
		 * /** Return the string "(x,y)", where edge goes from x to y
		 */
		public String toString() {
			return "(" + from + "," + to + ")";
		}
	}

	/**
	 * Constructor for Graph
	 *
	 * @param n
	 *            : int - number of vertices
	 */
	public Graph() {
		vertex = new HashMap<>();
	}

	/**
	 * Method to add an edge to the graph This version is obsolete and kept for
	 * backward compatibility
	 *
	 * @param a
	 *            : int - one end of edge
	 * @param b
	 *            : int - other end of edge
	 */
	public Edge addEdge(Vertex from, Vertex to) {
		Edge e = new Edge(from, to);
		from.adj.add(e);
		to.adj.add(e);
		return e;
	}

	/** Number of vertices in graph */
	public int size() {
		return n;
	}

	public static Graph readGraph(Scanner in) {
		String line;
		Vertex city1, city2;
		String[] cities;
		Graph g = new Graph();
		while (in.hasNextLine()) {
			line = in.nextLine();
			cities = line.split(", ");
			if ((city1 = g.vertex.get(cities[0])) == null) {
				city1 = new Vertex(cities[0]);
				g.vertex.put(cities[0], city1);
			}
			if ((city2 = g.vertex.get(cities[1])) == null) {
				city2 = new Vertex(cities[1]);
				g.vertex.put(cities[1], city2);
			}
			g.addEdge(city1, city2);
		}
		return g;
	}
}