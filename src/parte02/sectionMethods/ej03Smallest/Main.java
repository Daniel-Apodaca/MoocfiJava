package parte02.sectionMethods.ej03Smallest;

//Define a two-parameter method "smallest" that returns the
// smaller of the two numbers passed to it as parameters.

public class Main {
    public static void main(String[] args) {
        int answer = smallest(3, 7);
        System.out.println("Smallest: " + answer);
    }

    public static int smallest(int number1, int number2) {
        if(number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
