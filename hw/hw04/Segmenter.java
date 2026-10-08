import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Segmenter {

    private final Trie trie;

    public Segmenter(Trie trie) {
        this.trie = trie;
    }


    public ArrayList<String> segmentShortest(String input) {
        ArrayList<String> words = new ArrayList<>();
        int start = 0;
        String curr = input.substring(start, start+1);

        while (start < input.length()) {
            int end = start + 1;
            curr = input.substring(start, end);
            while (end <= input.length() && !trie.contains(curr)) {
                curr = input.substring(start, end);
                end++;
            }

            if (end > input.length()) {
                break;
            }

            words.add(input.substring(start, end));
            start = end;
        }

        return words;
    }

    public ArrayList<String> segmentLongest(String input) {

        // Implement this
        return null;
    }

    public static void main(String[] args) throws IOException {
        Trie sample_trie = new Trie("sample_vocab.txt");
        System.out.println(sample_trie.contains("the"));
        System.out.println(sample_trie.contains("ant"));
        System.out.println(sample_trie.contains("ants"));



        Segmenter segmenter = new Segmenter(sample_trie);



        String input = "theantbitthepanda";
        System.out.println("Shortest: " + segmenter.segmentShortest(input));

        System.out.println("Get count after first segmentation: " + Trie.getCount());

        System.out.println("Longest:  " + segmenter.segmentLongest(input));

        System.out.println("Get count after second segmentation: " +Trie.getCount());
    }
}