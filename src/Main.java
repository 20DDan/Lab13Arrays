public class Main {

    public static void main(String[] args) {
        System.out.println("This Is My First JAva Project ... NOT!");
        System.out.println("Hello World!");

        String Mihai;
        String Ionel;
        String Ghita;

        System.out.println(" Mihai &" + " Ionel &" + " Gusti" + " toti au mers la piata");

        double A = 57;
        double B = 4;

        System.out.println("A added to B");
        System.out.println(A + B);
        System.out.println("A multiplied by B Listed Below");
        System.out.println(A * B);
        System.out.println("A divided by B Listed Below");
        System.out.println(A / B);
        System.out.println("Part A Method 1 Directly Displayed");
        System.out.println(-5 + 8 * 6);
        System.out.println("Part A Method 2 using Sum");
        System.out.println(sum(-5, 8 * 6));
        System.out.println("Part B");
        System.out.println(sum(55, 9 / 9f));
        System.out.println("Part C");
        System.out.println(sum(20, -3 * 5f / 8));
        System.out.println("Part D");
        System.out.println(sum(5, 15 / 3f * 2 - 8f / 3));

        System.out.println("Result from adding 2 numbers together");
        System.out.println(sum(57, 7));
        System.out.println("Result from subtracting 2 numbers together");
        System.out.println(subtract(695, 7));
        System.out.println("Result from multiplying 2 numbers together");
        System.out.println(multiply(467, 567));
        System.out.println("Result from dividing 2 numbers together");
        System.out.println(divide(456, 45));
        printJava();
    }


    public static void printJava() {
        System.out.println("   J   A   V     V     A");
        System.out.println("   J  A A   V   V     A A");
        System.out.println("   J  AAAA   V V     AAAAA");
        System.out.println("J  J A   A    V     A     A");
        System.out.println(" J  A     A   V    A        A");
    }

    public static double sum(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;

    }

    public static double multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;

    }

    public static double divide(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;

    }


}
