package ds.trie.hashmap;

import java.util.HashMap;

public class TrieNode {

	public HashMap<Character, TrieNode> children = new HashMap<>();
	public boolean isWord;

	TrieNode() {
		isWord = false;
		children = new HashMap<>();
	}

}
