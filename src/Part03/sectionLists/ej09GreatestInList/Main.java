//INSTRUCCIONES
//The exercise template contains a base that reads numbers from the user
//        and adds them to a list. Reading is stopped once the user
//        enters the number -1.
//
//        Continue developing the program so that it finds the greatest
//        number in the list and prints its value after reading all the
//        numbers. The programming should work in the following manner.

package Part03.sectionLists.ej09GreatestInList;

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


        int greatest = list.get(0);

        for (int i = 0; i <= list.size() -1; i++) {
            int number = list.get(i);
            if(number > greatest) {
                greatest = number;
            }


        }

        System.out.println("The greatest number: " + greatest);
    }
}