//INSTRUCCIONES:
//The exercise template already contains a program, that creates an array
//        and prints the values of the array twice. Modify the program
//        to do following: After the first printing, the program should
//        ask for two indices from the user. The values in these two
//        indices should be swapped, and in the end the values of the
//        array should be printed once again.

package Part03.Arrays.ej01Swap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for(int nums: numbers) {
            System.out.println(nums);
        }

        System.out.println("Give two indices to swap:");
        int num = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());

        int helper = numbers[num];
        numbers[num] = numbers[num2];
        numbers[num2] = helper;

        for(int nums: numbers) {
            System.out.println(nums);
        }


    }
}
