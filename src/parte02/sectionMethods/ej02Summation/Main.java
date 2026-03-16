package parte02.sectionMethods.ej02Summation;

//Expand the method sum in the exercise template so that
// it calculates and returns the sum of the numbers that are
// given as the parameters.
//Create the method using the following structure:
//public static int sum(int number1, int number2, int number3, int number4) {
//    // write your code here
//    // remember to include return (at the end)!
//}
//
//public static void main(String[] args) {
//    int answer = sum(4, 3, 6, 1);
//    System.out.println("Sum: " + answer);
//}


public class Main {
    public static void main(String[] args) {

        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        int result = number1 + number2 + number3 + number4;
        return result;
    }

}
