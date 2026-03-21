package parte02.sectionMethods.ej08PrintTriangle;

public class Main {
    public static void printStars(int number) {
        int init = 1;
        while(init <= number ) {
            System.out.print("*");
            init++;
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {

        int init = 1;
        while(init <= size) {
            printStars(init);
            init++;

        }



    }


    public static void main(String[] args) {
        printTriangle(4);
    }

}
