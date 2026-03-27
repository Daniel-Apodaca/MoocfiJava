package Part03.sectionLists.ej01ThirdElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> addedNames = new ArrayList<>();

        System.out.println("Enter names, empty to exit");
        String names = input.nextLine();

        while(true) {

            if (names.isBlank()) {
                break;
            } else {
                addedNames.add(names);
                names = input.nextLine();
            }
        }

        System.out.println(addedNames.get(2));
        input.close();

    }


}
