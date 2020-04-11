package ds.tree.binarysearch;

public class BinarySearchTree {

	private Node root;

	public static void main(String[] args) {
		BinarySearchTree bs = new BinarySearchTree();
		bs.add(1);
		bs.add(2);
		bs.add(4);
		bs.add(5);
		bs.add(3);
		// System.out.println(bs.contains(2));
		Node test = new Node(1);
		test.left = new Node(2);
		test.right = new Node(3);
		test.left.left = new Node(4);
		test.left.right = new Node(5);
		test.right.left = new Node(6);
		test.right.right = new Node(7);

		System.out.println("Breadth First Search");
		BFS b = new BFS();
		b.breadthFirstTraversal(test);

		System.out.println("\nDepth First Search");
		DFS d = new DFS();

		System.out.println("\n** Recursive **");
		System.out.print("Inorder:\t");
		d.recursiveInorder(test);
		System.out.print("\nPreorder:\t");
		d.recursivePreOrder(test);
		System.out.print("\nPostorder:\t");
		d.recursivePostOrder(test);

		System.out.println("\n\n** Iterative **");
		System.out.print("Inorder:\t");
		d.iterativeInorder(test);
		System.out.print("\nPreorder:\t");
		d.iterativePreOrder(test);
		System.out.print("\nPostorder:\t");
		d.iterativePostOrder(test);

	}

	// insertion
	public void add(int value) {
		root = addRecursive(root, value);
	}

	public Node addRecursive(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		if (value < root.value) {
			root.left = addRecursive(root.left, value);
		} else if (value > root.value) {
			root.right = addRecursive(root.right, value);
		} else {
			return root;
		}

		return root;
	}

	// find an element
	public boolean contains(int value) {
		return containsRecursive(root, value);
	}

	public boolean containsRecursive(Node root, int value) {
		if (root == null)
			return false;
		if (root.value == value)
			return true;
		return (value < root.value) ? containsRecursive(root.left, value) : containsRecursive(root.right, value);
	}

	// Deletion
	public Node delete(int value) {
		return deleteRecursive(root, value);
	}

	public Node deleteRecursive(Node root, int value) {
		if (root == null)
			return null;

		if (value < root.value) {
			root.left = deleteRecursive(root.left, value);
		} else if (value > root.value) {
			root.right = deleteRecursive(root.right, value);
		} else {
			if (root.left == null && root.left == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				int min = findMin(root.right).value;
				root.value = min;
				root.right = deleteRecursive(root.right, min);
			}
			return root;
		}
		return root;
	}

	Node findMin(Node root) {
		return root.left == null ? root : findMin(root.left);
	}

}
