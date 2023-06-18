import java.util.Scanner;
public class Reverse_a_string {
    public static void main (String[] args) {
        System.out.println("Enter a string: ");
        Scanner k = new Scanner(System.in);
        String input = k.nextLine();
        StringBuilder string = new StringBuilder(); //Using StringBuilder object and append method below
        int string_length = input.length();
        for (int i = string_length - 1; i >= 0; i--) {
            char letter = input.charAt(i);
            string.append(letter);
        }
        System.out.println(string);
    }
}
