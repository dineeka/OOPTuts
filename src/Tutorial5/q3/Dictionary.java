package Tutorial5.q3;

public class Dictionary extends Book {
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }
    @Override
    public String toString() {
        String s = "Number of pages: " + super.toString();
        s = s + ", Number of words: " + words;
        return s;
    }
}
