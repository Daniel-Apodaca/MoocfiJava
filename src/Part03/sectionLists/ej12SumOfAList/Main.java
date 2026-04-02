package Part03.sectionLists.ej12SumOfAList;

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

        int sum = 0;

        for (int numList : list) {
            sum = numList + sum;
        }

        System.out.println("Sum: " + sum);
        input.close();
    }


}
