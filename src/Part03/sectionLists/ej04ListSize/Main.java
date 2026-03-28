//INSTRUCTIONS
//In the exercise template is a program that reads input from the user.
//        Modify its working so that when the program quits reading,
//        the program prints the number of values on the list.

package Part03.sectionLists.ej04ListSize;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter names, quit to exit: ");
        String names = input.nextLine();

        while(!(names.isBlank())) {
            list.add(names);
            names = input.nextLine();
        }
        int listSize = list.size();
        System.out.println("In total: " + listSize);

    }
}
