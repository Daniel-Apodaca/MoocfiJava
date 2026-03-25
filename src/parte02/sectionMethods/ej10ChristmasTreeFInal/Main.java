package parte02.sectionMethods.ej10ChristmasTreeFInal;

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


    public static void christmasTree(int height) {

        int counter = 1;
        int init = 1;
        int spaceMinus = height -1;
        int baseSpaces = height -2;

        //IMPRIME  EL PINO
        while(counter <= height) {
            printSpaces(spaceMinus);
            printStars(init);
            init = init + 2;
            spaceMinus = spaceMinus - 1;
            counter++;
        }

        //IMPRIME LA BASE
        int start = 1;
        int end = 2;
        while(start <= end) {
            printSpaces(baseSpaces);
            printStars(3);
            start++;
        }





    }



    public static void main(String[] args) {
        christmasTree(6);
    }
}
