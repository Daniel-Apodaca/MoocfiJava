//Write a program that asks the user for a string. If the user writes the string "true",
//        the program prints "You got it right!", otherwise it prints "Try again!".

package Part03.Strings.ej02IsItTrue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a string: ");

        String word = input.nextLine();

        if(word.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
