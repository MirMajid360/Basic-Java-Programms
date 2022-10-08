import java.util.Scanner;

public class SwapUsingXor {

    public static void main(String args[]) {

        int num1,num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First No. \n");
        num1 = scanner.nextInt();

        System.out.print("Enter First No. \n");
        num2 = scanner.nextInt();
        System.out.print("Num1 =\t"+num1+"\tNum2=\t"+num2);

        swap( num1,num2);
    }

    private static void swap(int num1, int num2) {

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.print("\nNum1 =\t"+num1+"\tNum2=\t"+num2);


    }


}
