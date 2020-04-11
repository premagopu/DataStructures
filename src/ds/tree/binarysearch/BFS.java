package ds.tree.binarysearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void breadthFirstTraversal(Node root) {
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {
			Node node = nodes.remove();
			System.out.print(node.value + " ");
			if (node.left != null) {
				nodes.add(node.left);
			}
			if (node.right != null) {
				nodes.add(node.right);
			}
		}
		System.out.println();

	}
}
