//INSTRUCCIONES
//In the exercise template there is a program that reads inputs from
// the user and adds them to a list. Reading is stopped once the user
// enters an empty string.
//
//Your task is to modify the method to print the last read value after
// it stops reading. Print the value that was read last from the list.
// Use the method that tells the size of a list to help you.

package Part03.sectionLists.ej05LasInLIst;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String names = input.nextLine();

        while (!(names.isBlank())) {
            list.add(names);
            names = input.nextLine();
        }

        int index = list.size() - 1;

        System.out.println(list.get(index));
        input.close();
    }
}

