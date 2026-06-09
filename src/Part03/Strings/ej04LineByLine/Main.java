//Write a program that reads strings from the user. If the input is
//        empty, the program stops reading input and halts.
//        For each non-empty input it splits the string input by whitespaces
//        and prints each part of the string on a new line.

package Part03.Strings.ej04LineByLine;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);





        while (true) {
            String text = input.nextLine();

            if(text.isEmpty()) {
            break;

        } else {
            String[] pieces = text.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
        }

    }
}
