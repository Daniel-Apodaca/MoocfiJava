package parte02.sectionMethods.ej06StarsignPrintSquare;

public class Main {
    public static void printStars(int number) {
        int init =1;
        while(init <= number ) {
            System.out.print("*");
            init++;
        }
        System.out.println("");
    }

    public static void printSquare(int number) {
        int counter = 1;
        while(counter <= number) {
            printStars(number);
            counter++;
        }

    }

    public static void main(String[] args) {
        printSquare(4);
    }


}
