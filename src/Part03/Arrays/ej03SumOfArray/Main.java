//INSTRUCTIONS:
//The class SumOfArray has a method public static int sumOfNumbersInArray(int[] array).
//Complete the method so that it computes and returns the sum of the numbers in the array it
//receives as parameter.

package Part03.Arrays.ej03SumOfArray;

public class Main {
    public static void main(String[] args) {
    int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] array) {
       int sum = 0;
        int index = 0;

        while(index < array.length) {
            sum = sum + array[index];
            index++;
        }

        return sum;
    }
}
