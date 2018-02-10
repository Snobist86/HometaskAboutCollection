package HometaskAboutCollection.TaskOne;


import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class StringListCollection {
    
    private static final int NUMBER_OF_LETTERS = 4;
    private static final String BUILT_IN_SYMBOLS = "****";

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("This");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer!");

        printCollection(words);
        markLenght4(words);
        System.out.println();
        System.out.println(words);
    }

    public static void printCollection(List<String> words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void markLenght4(List<String> words) {
        for (int i = 0; i < words.size(); ) {
            String word = words.get(i);
            if (word.length() == NUMBER_OF_LETTERS) {
                int pos = words.indexOf(word);
                words.add(pos, BUILT_IN_SYMBOLS);
                i++;
            }
            i++;
        }
    }
}