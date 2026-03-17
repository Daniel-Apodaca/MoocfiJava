package parte02.sectionMethods.ej05Averaging;

//Create a method called average that calculates the average
//of the numbers passed as parameters. The previously created method sum
//must be used inside this method!
// Expected Output: Average: 3.5

public class Main {
    public static void main(String[] args) {
    double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

    //Metodo para calcular Average
    public static double average(int number1, int number2, int number3, int number4) {
    double avg = (double) sum(number1, number2, number3, number4) / 4;
    return avg;
    }

    //Sum method used in excercise02 "Sumation"
    public static int sum(int number1, int number2, int number3, int number4) {
        int result = number1 + number2 + number3 + number4;
        return result;
    }


}
