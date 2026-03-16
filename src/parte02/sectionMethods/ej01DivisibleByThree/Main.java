package parte02.sectionMethods.ej01DivisibleByThree;

// PROGRAMMING EXCERCISE: Divisible By Three
//Write a method public static void divisibleByThreeInRange(int beginning, int end)
//that prints all the numbers divisible by three in the given range.
//The numbers are to be printed in order from the smallest to the greatest.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        divisibleByThreeInRange(2,10);

    }

    public static void divisibleByThreeInRange(int beggining, int end) {
        for(int i = beggining; i <= end; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}