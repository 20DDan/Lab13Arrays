import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public int getInt() {
        Scanner MyNewScanner = new Scanner(System.in);
        int x;
        do {
            try {
                System.out.println("Enter a number");
                x = MyNewScanner.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("This number '" + MyNewScanner.nextLine() + "is wrong. Do it again!");
            }
        } while (true);
    }
}
