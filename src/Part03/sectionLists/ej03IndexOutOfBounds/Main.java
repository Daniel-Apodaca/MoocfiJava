//INSTRUCTIONS
//A list is extremely useful for storing the values of variables for
//        later use. That said, making mistakes is also relatively easy
//        with a list.
//
//        There is a program that uses a list in the exercise template.
//        Modify it so that its execution always produces the error
//        IndexOutOfBounds. The user should not have to give any inputs
//        to the program (e.g. write something on the keyboard)
//
//        You can also see a means for going through the values of a
//        list — we will return to this topic a bit later.

package Part03.sectionLists.ej03IndexOutOfBounds;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myIntList = new ArrayList<>();

        myIntList.add(1);
        myIntList.add(2);

        System.out.println(myIntList.get(2));
    }
}
