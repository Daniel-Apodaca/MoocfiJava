package parte02.sectionMethods.ej07PrintingaRectangle;

public class Main {
    public static void printStars(int number) {
        int init = 1;
        while(init <= number ) {
            System.out.print("*");
            init++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        int counter = 1;
        while(counter <= height) {
            printStars(width);
            counter++;
        }
    }


    public static void main(String[] args) {
        printRectangle(17, 3);
    }


}
