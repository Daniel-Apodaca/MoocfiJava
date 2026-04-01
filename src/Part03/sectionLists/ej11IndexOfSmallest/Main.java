//INSTRUCCIONES
//Write a program that reads numbers from the user. When number 9999
//        is entered, the reading process stops. After this the program
//        will print the smallest number in the list, and also the
//        indices where that number is found. Notice: the smallest
//        number can appear multiple times in the list.

package Part03.sectionLists.ej11IndexOfSmallest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int numbers = Integer.parseInt(input.nextLine());

        while (numbers != 9999) {
            list.add(numbers);
            numbers = Integer.parseInt(input.nextLine());
        }


        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);


        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }


    }
}
