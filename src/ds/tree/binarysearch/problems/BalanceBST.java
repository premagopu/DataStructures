package ds.tree.binarysearch.problems;

import java.util.ArrayList;
import java.util.List;

import ds.tree.binarysearch.Node;

public class BalanceBST {

	public static void main(String[] args) {
		Node test = new Node(4);
		test.left = new Node(3);
		test.left.left = new Node(2);
		test.left.left.left = new Node(1);
		test.right = new Node(5);
		test.right.right = new Node(6);
		test.right.right.right = new Node(7);
		BalanceBST b = new BalanceBST();
		Node result = b.buildBalancedBST(test);
		b.preOrder(result);
	}

	public  Node buildBalancedBST(Node root){
		List<Integer> nodes = new ArrayList<>();
		inOrder(nodes, root);
		return  buildTreeUtil(nodes, 0, nodes.size()-1);
	}
	
	void inOrder(List<Integer> nodes, Node root){
		if(root == null) return;
		inOrder(nodes, root.left);
		nodes.add(root.value);
		inOrder(nodes, root.right);
    }
	
	public Node buildTreeUtil(List<Integer> nodes, int i, int j){
		if(i > j) return null;
		int mid = (i + j)/2;
		Node root = new Node(nodes.get(mid));
		root.left = buildTreeUtil(nodes, i, mid-1);
		root.right = buildTreeUtil(nodes, mid+1, j);
		return root;
	}
	
	void preOrder(Node node)  
    { 
        if (node == null) 
            return; 
        System.out.print(node.value + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    } 

}
