//Write a program that reads user input until an empty line.
//        For each non-empty string, the program splits the string by spaces
//        and then prints the pieces that contain av, each on a new line.

package Part03.Strings.ej05AVClub;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            String text = input.nextLine();
            String[] pieces = text.split(" ");

            if(text.isEmpty()) {
                break;
            } else {
                for(int i = 0; i < pieces.length; i++) {
                    if(pieces[i].contains("av")) {
                        System.out.println(pieces[i]);

                    }
                }
            }
        }
    }
}
