//INSTRUCCIONES:
//The exercise template contains a base that reads numbers from the user
//        and adds them to a list. Reading is stopped once the user
//        enters the number -1.
//
//        When reading ends, calculate the average of the numbers in it,
//        and then print that value.

package Part03.sectionLists.ej13AverageOfaList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int numbers = Integer.parseInt(input.nextLine());

        while(numbers != -1) {
            list.add(numbers);
            numbers = Integer.parseInt(input.nextLine());
        }

        int sum = 0;
        int count = 0;
        for(int readNumbs : list) {
            sum += readNumbs;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("Average: " + avg);
    }
}
