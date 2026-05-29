//Write a program, that reads a string from the user and then prints it three times.
//NB! The program should ask for only one string. Don't use a loop here.



        package Part03.Strings.ej01PrintThrice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = input.nextLine();

        System.out.print(word);
        System.out.print(word);
        System.out.print(word);

    }
}
