//In the exercise template there is a program that reads integers
//from the user and adds them to a list.
//This ends when the user enters 0. The program then prints the f
//first value on the list.
//
//Modify the program so that instead of the first value, the program
//prints the sum of the second and third numbers.
//The program is allowed to malfunction if there are fewer than
//three entries on the list, so you don't need to prepare for
//such an event at all.

package Part03.sectionLists.ej02SecondPlusThird;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbersAdded = new ArrayList<>();

        int number = Integer.valueOf(input.nextLine());
        int sum = 0;

        while (number != 0) {
            numbersAdded.add(number);
            number = Integer.valueOf(input.nextLine());

        }
        sum = numbersAdded.get(1) + numbersAdded.get(2);
        System.out.println(sum);
        input.close();


    }
}
