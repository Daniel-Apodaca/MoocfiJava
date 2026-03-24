package parte02.sectionMethods.ej09PrintChristmasTree;

import java.sql.SQLOutput;

public class Main {

    //CORRECTO IMPRIME ESTRELLAS
    public static void printStars(int number) {
        int init = 1;
        while(init <= number ) {
            System.out.print("*");
            init++;
        }
        System.out.println("");
    }

    //CORRECTO IMPRIME ESPACIOS
    public static void printSpaces(int number) {
        int init = 1;
        while(init <= number) {
            System.out.print(" ");
            init++;
        }
    }

    public static void printTriangle(int size) {
        int init = 1;
        int minus = size - 1 ;
        while(init <= size) {
            printSpaces(minus);
            printStars(init);
            init++;
            minus--;
        }
    }



    public static void main(String[] args) {
    printTriangle(4);
    }
}
