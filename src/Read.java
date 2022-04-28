import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    //   This scans for numerical input and prompts you to repeat till it gets numerical value ONLY!

    public double getDouble() {
        Scanner MyNewScanner = new Scanner(System.in);
        double x;
        do {
            try {
                System.out.println("Enter a number");
                x = MyNewScanner.nextDouble();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("This number '" + MyNewScanner.nextLine() + "is wrong. Do it again!");
            }
        } while (true);
    }
}
