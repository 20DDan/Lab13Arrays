public class Main {

    public static void main(String[] args) {
        System.out.println("This Is My First JAva Project ... NOT!");
        System.out.println("Hello World!");

        String Mihai;
        String Ionel;
        String Ghita;

        System.out.println(" Mihai &"  + " Ionel &" + " Gusti" + " toti au mers la piata");

        double A = 57;
        double B = 4;

        System.out.println("A added to B");
        System.out.println(A+B);
        System.out.println("A multiplied by B Listed Below");
        System.out.println(A*B);
        System.out.println("A divided by B Listed Below");
        System.out.println(A/B);
        System.out.println("Part A Method 1 Directly Displayed");
        System.out.println(-5+8*6);
        System.out.println("Part A Method 2 using Sum");
        System.out.println(sum(-5,8*6));
        System.out.println("Part B");
        System.out.println(sum(55,9/9f));
        System.out.println("Part C");
        System.out.println(sum(20, -3*5f/8));
        System.out.println("Part D");
        System.out.println(sum(5, 15/3f*2-8f/3));


    }
    public static double sum(double firstNumber , double secondNumber){
        double result = firstNumber + secondNumber;
        return result;
    }
    public static int subtract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;



    }

}