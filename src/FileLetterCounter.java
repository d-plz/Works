import java.util.Scanner;
import java.io.*;
public class FileLetterCounter {
    public static void main (String[] args) throws FileNotFoundException {
        // Processs user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name");
        String file_name = keyboard.nextLine();
        System.out.println("Enter a character");
        char character = keyboard.next().charAt(0);
        int count = 0, total = 0;
        // Scan and create new file
        Scanner output = new Scanner(new File(file_name));
        // Scan for desired character
        while (output.hasNext()){
            String line = output.nextLine();
            for (int i = 0; i < line.length(); i++){
                if (line.charAt(i) == character){
                    count++;
                }
            }
        }
        System.out.println("The character " + "'" + character + "'" + " appears in the file " + file_name + " " + count + " times.");


    }
}