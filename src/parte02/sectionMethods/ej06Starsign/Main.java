package parte02.sectionMethods.ej06Starsign;

public class Main {
    public static void printStars(int number) {
        int init =1;
        while(init <= number ) {
            System.out.print("*");
            init++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);



    }
}

