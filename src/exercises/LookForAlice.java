package exercises;
import java.util.Scanner;

public class LookForAlice {
    public static void main(String[] args) {
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        paragraph = paragraph.toLowerCase();
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();

        {
            if (paragraph.contains(searchTerm)) {
                int index = paragraph.indexOf(searchTerm);
                int length = searchTerm.length();
                System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
                String modifiedSentence = paragraph.replace(searchTerm, "___");
                System.out.println(modifiedSentence);
            } else {
                System.err.println("Not found");
            }
        }
    }

}