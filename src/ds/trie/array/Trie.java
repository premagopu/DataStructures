package ds.trie.array;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("hello");
		System.out.println(t.search("hello"));
		System.out.println(t.startsWith("hel"));

	}

	private void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (current.children[index] == null) {
				current.children[index] = new TrieNode();
			}
			current = current.children[index];
		}
		current.isEnd = true;
	}

	private boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			current = current.children[index];
			if (current == null) {
				return false;
			}
		}
		return current.isEnd;
	}

	public boolean startsWith(String prefix) {
		TrieNode current = root;
		for (int i = 0; i < prefix.length(); i++) {
			int index = prefix.charAt(i) - 'a';
			current = current.children[index];
			if (current == null) {
				return false;
			}
		}
		return true;
	}

}
