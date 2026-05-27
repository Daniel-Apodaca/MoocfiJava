package Part03.Arrays.eJ02IndexWasNotFound;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[8];
        numbers[0] = 13;
        numbers[1] = 32;
        numbers[2] = 10;
        numbers[3] = 3;
        numbers[4] = 12;
        numbers[5] = 18;
        numbers[6] = 7;
        numbers[7] = 17;

        int index = -1;

        System.out.print("Search for? ");
        int number = Integer.valueOf(input.nextLine());

        for(int i = 0; i < numbers.length; i++) {
            if(number == numbers[i]) {
                index = i;
            }
        }

        if(index != -1) {
            System.out.println(number + " found at index " + (index + 1));
        } else {
            System.out.println("Number not found");
        }






    }
}



