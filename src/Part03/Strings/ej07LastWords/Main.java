//Write a program that reads user input until an empty line is entered.
//        For each non-empty line the program splits the string by spaces
//        and prints the last part of the string.
//
//

package Part03.Strings.ej07LastWords;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            String text = input.nextLine();
            String[] pieces = text.split(" ");

           if (text.isEmpty()) {
               break;
           } else {
               for(int i = 0; i < pieces.length; i++) {
                   if (i == pieces.length -1 ) {
                       System.out.println(pieces[i]);
                   }
               }
           }


        }
    }
}
