package Part03.sectionLists.ej06FirstandLast;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String names = input.nextLine();

        while(!(names.isBlank())) {
            list.add(names);
            names = input.nextLine();
        }

        int index = list.size() -1;
        System.out.println(list.get(0));
        System.out.println(list.get(index));

    }
}
