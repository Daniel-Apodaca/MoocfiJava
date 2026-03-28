//INSTRUCCIONES
//The exercise template contains a base that reads numbers from the
//        user and adds them to a list. Reading is stopped once the
//        user enters the number -1.
//
//        Expand the functionality of the program so that after reading
//        the numbers, it prints all the numbers received from the user.
//        The number used to indicate stopping should not be printed.


package Part03.sectionLists.ej07RememeberThisNumbers;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int numbers = Integer.parseInt(input.nextLine());

        while (numbers != -1) {
            list.add(numbers);
            numbers = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
