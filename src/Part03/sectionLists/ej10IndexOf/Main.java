//INSTRUCCIONES
//The exercise template contains a base that reads numbers from the
//        user and adds them to a list. Reading is stopped once the
//        user enters the number -1.
//
//        Expand the program by adding a functionality that asks the
//        user for a number, and reports that number's index in the list.
//        If the number is not found, the program should not print
//        anything.


package Part03.sectionLists.ej10IndexOf;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int numbers = Integer.parseInt(input.nextLine());

        while (numbers != -1) {
            list.add(numbers);
            numbers = Integer.parseInt(input.nextLine());
        }

        System.out.println("Search for? ");
        int search = Integer.parseInt(input.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (search == list.get(i)) {
                System.out.println(search + " is at index " + i);

            }
        }

        input.close();
    }


}

