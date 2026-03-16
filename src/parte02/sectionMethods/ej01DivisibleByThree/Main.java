package parte02.sectionMethods.ej01DivisibleByThree;


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