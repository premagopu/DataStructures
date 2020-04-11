package ds.tree.binarysearch;

import java.util.Stack;

public class DFS {

	public void recursiveInorder(Node root) {
		if (root != null) {
			recursiveInorder(root.left);
			System.out.print(root.value + " ");
			recursiveInorder(root.right);
		}
	}

	public void recursivePreOrder(Node root) {
		if (root != null) {
			System.out.print(root.value + " ");
			recursivePreOrder(root.left);
			recursivePreOrder(root.right);
		}
	}

	public void recursivePostOrder(Node root) {
		if (root != null) {
			recursivePostOrder(root.left);
			recursivePostOrder(root.right);
			System.out.print(root.value + " ");
		}
	}

	public void iterativeInorder(Node root) {
		Stack<Node> nodes = new Stack<>();
		Node current = root;

		nodes.push(root);

		while (!nodes.isEmpty()) {
			while (current.left != null) {
				current = current.left;
				nodes.push(current);
			}
			current = nodes.pop();
			System.out.print(current.value + " ");
			if (current.right != null) {
				current = current.right;
				nodes.push(current);
			}
		}

	}
	
	public void iterativePreOrder(Node root){
		Stack<Node> nodes = new Stack<>();
		Node current = root;
		
		nodes.push(root);
		
		while(!nodes.isEmpty()){
			current = nodes.pop();
			System.out.print(current.value+" ");
			if(current.right != null){
				nodes.push(current.right);
			}
			if(current.left != null){
				nodes.push(current.left);
			}
		}
		
	}
	
	
	public void iterativePostOrder(Node root){
		Stack<Node> nodes = new Stack<>();
		Node current = root;
		Node prev = root;
		
		nodes.push(root);
		
		while(!nodes.isEmpty()){
			current = nodes.peek();
			boolean noChildren = (current.left == null && current.right == null);
			boolean isPrevLastChild = (prev == current.right || prev == current.left && current.right == null);
			if(noChildren || isPrevLastChild){
				current = nodes.pop();
				System.out.print(current.value + " ");
				prev = current;
			}else{
				if(current.right != null){
					nodes.push(current.right);
				}
				if(current.left != null){
					nodes.push(current.left);
				}
			}
		}
		
	}

}
