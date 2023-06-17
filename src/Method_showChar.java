import java.util.Scanner;

public class Method_showChar {
    public static void main (String[] args) {
        System.out.print("Enter a line of text:");
        Scanner keyboard = new Scanner(System.in);
        String line_of_text = keyboard.nextLine();
        System.out.print("Enter your index:");
        int num_of_character = keyboard.nextInt();
        showChar(line_of_text,num_of_character);
    }
    public static void showChar(String line_of_text, int num_of_character) {
        char character = line_of_text.charAt(num_of_character);
        System.out.println(character);
    }
}
