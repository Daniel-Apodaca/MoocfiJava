//INSTRUCCIONES:
//In the exercise template there is a program that reads inputs
//        from the user until an empty string is entered. Add the
//        following functionality to it: after reading the inputs
//        one more string is requested from the user. The program
//        then tell whether that string was found in the list or not.


package Part03.sectionLists.ej14OnTheList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String names = input.nextLine();

        while (!(names.isBlank())) {
            list.add(names);
            names = input.nextLine();
        }

        System.out.print("Search for: ");
        names = input.nextLine();

        for (String findNames : list) {
            if (findNames.contains(names)) {
                System.out.println(names + " was found!");
            }
        }
        input.close();

    }
}
