//Complete the method public static void printArrayInStars(int[] array)
//in the class named 'Printer' to make it print a row of stars for each number in the array.
//The amount of stars on each row is defined by the corresponding number in the array.
//
//You can try out the printing with this example:
//
//int[] array = {5, 1, 3, 4, 2};
//printArrayInStars(array);

package Part03.Arrays.ej05PrintinStars;

public class Printer {
    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int helper = 0;
            if(helper < array[i] ) {
                int counter = 0;
                while(counter != array[i]) {
                    counter++;
                    System.out.print("*");
                }
                System.out.println("");

            }


        }

    }
}
