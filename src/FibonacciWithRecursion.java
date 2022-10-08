import java.util.Scanner;

public class FibonacciWithRecursion {

    static int num1 = 0, num2 = 1, count, fab = 0;

    public static void main(String args[]) {

        /** Fibonacci Series  with Recursion by Majid Manzoor Mir on 07/10/2022, 07:25am **/


        System.out.print("Enter Number up to you want to print Fibonacci Series \n");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        fibonacii(count-1);


    }

    private static void fibonacii(int i) {

        if (i>=0){
            num1 = num2;
            num2 = fab;
            System.out.print(fab);
            fab = num1+num2;
            fibonacii(i-1);
        }






    }
}
