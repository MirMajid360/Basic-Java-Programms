import java.util.Scanner;

public class PrimeNumber {

    /**
     * Prime Number  by Majid Manzoor Mir on 07/10/2022, 07:50am
     **/

    public static void main(String args[]) {

        int num;
        System.out.print("Enter No. to check whether it is prime or not\n");
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        CheckPrime(num);
    }

    private static void CheckPrime(int num) {

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {


                System.out.print("Number is Not Prime");
                return;
            }

        }
        System.out.print("Prime Number");
    }

}
