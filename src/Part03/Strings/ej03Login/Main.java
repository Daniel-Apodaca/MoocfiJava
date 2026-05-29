//Write a program that recognizes the following users:
//
//        username	password
//        alex	sunshine
//        emma	haskell
//        The program either shows a personal message or informs of an
//        incorrect username or password.

//NB! You can't compare strings with ==!
//        NB! Logins should not be implemented like this in real life!
//        You can become familiar with safer ways to implement logins on courses
//        focusing on web programming.



        package Part03.Strings.ej03Login;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = input.nextLine();
        System.out.print("Enter password: ");
        String pass = input.nextLine();

        if(user.equals("alex") && pass.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (user.equals("emma") && pass.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }


    }
}
