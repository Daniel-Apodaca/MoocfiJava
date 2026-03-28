//INSTRUCCIONES
//The exercise template contains a base that reads numbers from the
//        user and adds them to a list. Reading is stopped once the
//        user enters the number -1.
//
//        Expand the program to ask for a start and end indices once
//        it has finished asking for numbers. After this the program
//        shall prints all the numbers in the list that fall in the
//        specified range (between the indices given by the user,
//        inclusive). You may assume that the user gives indices that
//        match some numbers in the list.

package Part03.sectionLists.ej08OnlyTheseNumbers;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int numbers = Integer.parseInt(input.nextLine());

        while (numbers != -1) {
            list.add(numbers);
            numbers = Integer.parseInt(input.nextLine());

        }

        System.out.print("From where? ");
        int first = Integer.parseInt(input.nextLine());
        System.out.print("To where? ");
        int last = Integer.parseInt(input.nextLine());

        for(int i = first; i <= last; i++) {
            System.out.println(list.get(i));
        }

        input.close();


    }
}
