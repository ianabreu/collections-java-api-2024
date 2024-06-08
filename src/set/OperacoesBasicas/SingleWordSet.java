package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class SingleWordSet {
    private final Set<String> words;

    public SingleWordSet() {
        this.words = new HashSet<>();
    }
    public void addWord(String word) {
        this.words.add(word);
    }
    public boolean removeWord(String word) {
        return this.words.remove(word);
    }
    public boolean checkWord(String word) {
        return this.words.contains(word);
    }
    public Set<String> displayUniqueWords() {
        return this.words;
    }

    @Override
    public String toString() {
        return "SingleWordSet{" +
                "words=" + words +
                '}';
    }

    public static void main(String[] args) {
        SingleWordSet g = new SingleWordSet();
        g.addWord("abc");
        g.addWord("def");
        g.addWord("abc");
        g.addWord("Abc");
        System.out.println(g.checkWord("abC"));

        System.out.println(g.removeWord("Abc"));
        // System.out.println(g.checkWord("tesTe"));
        System.out.println(g.displayUniqueWords());


    }

}
