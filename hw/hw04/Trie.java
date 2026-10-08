import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Trie {

    /** A single node in the Trie. */
    public class TrieNode {
        private final Map<Character, TrieNode> children = new HashMap<>();
        private boolean isWord = false;

        private TrieNode() { }

        public TrieNode get(char c) {
            queries++;
            return children.get(c);
        }

        /** Returns true if the path from the root to this node spells a word. */
        public boolean isWord() {
            return isWord;
        }
    }

    private final TrieNode root = new TrieNode();
    private static int queries = 0;
    private int size = 0;


    
    public Trie(String vocabFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(vocabFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim().toLowerCase();
                if (word.isEmpty() || word.startsWith("#")) {
                    continue;
                }
                insert(word);
            }
        }
    }

    private void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            current = current.children.computeIfAbsent(word.charAt(i), k -> new TrieNode());
        }
        if (!current.isWord) {
            current.isWord = true;
            size++;
        }
    }

    // Returns true if the word is in the Trie. 
    public boolean contains(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            current = current.get(word.charAt(i));
            if (current == null) {
                return false;
            }
        }
        return current.isWord();
    }

    // Returns the root node of the Trie.
    public TrieNode getRoot() {
        return root;
    }

    // Returns the number of words stored in the Trie.
    public int size() {
        return size;
    }

    // Returns the number of get() operations made across all Tries
    public static int getCount() {
        return queries;
    }

}