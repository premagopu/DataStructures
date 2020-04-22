package ds.trie.hashmap;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("Hello");
		t.search("Hello");
		t.startsWith("Hel");

	}

	private void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (current.children.get(c) == null) {
				current.children.put(c, new TrieNode());
			}
			current = current.children.get(c);
		}
		current.isWord = true;

	}

	private boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			current = current.children.get(c);
			if (current == null) {
				return false;
			}
		}
		return current.isWord;
	}

	public boolean startsWith(String prefix) {
		TrieNode current = root;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			current = current.children.get(c);
			if (current == null) {
				return false;
			}
		}
		return true;
	}

}
