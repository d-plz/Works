import java.util.Scanner;
public class find_longest_word {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner k = new Scanner(System.in);
        String input = k.nextLine();
        String[] words = input.split("[^a-zA-Z]+");//splitting words. only letters
        //Now I have a string array which contains all words, need to compare them to each other
        // first need to access the words
        for (int i = 0; i <= words.length; i++) {
        }
    }
}
