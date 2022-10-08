import java.util.Scanner;

public class Factorial {
    /**
     * Factorial of a Number  by Majid Manzoor Mir on 07/10/2022, 08:00am
     **/

    public static void main(String args[]) {

        int num;
        System.out.print("Enter Number: \n");
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

       Integer fact =  factorial(num);
       System.out.print("Factorial of "+ num+" is "+fact);
    }

    private static Integer factorial(int num) {

        Integer fact=1;
       while (num>=1){
           fact =fact*num;
           num--;

       }

       return fact;


    }
}
