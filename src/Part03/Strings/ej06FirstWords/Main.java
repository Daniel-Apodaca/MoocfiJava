package Part03.Strings.ej06FirstWords;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            String text = input.nextLine();
            String[] pieces = text.split(" ");

            if (text.isEmpty()) {
                break;
            } else {
                System.out.println(pieces[0]);
            }
        }
    }
}



