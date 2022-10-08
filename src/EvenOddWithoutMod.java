import java.util.Scanner;

public class EvenOddWithoutMod {

    /**
     * Checking Number i Even or Odd Without using % operator by Majid Manzoor Mir on 07/10/2022, 07:50am
     **/

    public static void main(String args[]) {

        int num;
        System.out.print("Enter No. \n");
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        CheckEvenOdd(num);
    }

    private static void CheckEvenOdd(int num) {

        /**Using Ternary Operator**/
        System.out.println((num & 1) == 0 ? "EVEN" : "ODD");

        /**
         * We can ue the another expression as
         * if(num /2)*2==num)
         *{ Even }
         * else{ Odd }
         * **/
    }
}
