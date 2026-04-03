package Part03.sectionLists.ej17RemoveLast;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {

        if(strings.isEmpty()) {
            return;
        }

        int total = strings.size() -1;
        strings.remove(total);
    }
}
