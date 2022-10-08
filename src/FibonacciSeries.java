import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {

        /** Fibonacci Series  without Recursion by Majid Manzoor Mir on 07/10/2022, 07:05am **/

        int num1 = 0, num2 = 1, count, fab = 0;

        System.out.print("Enter Number up to you want to print Fibonacci Series \n");
        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();
        System.out.print(num1 + "\t" + num2+"\t");

        for (int i = 2; i <= count; i++) {


            fab = num1 + num2;
            System.out.print(fab+"\t");
            num1 = num2;
            num2 = fab;


        }


    }
}
