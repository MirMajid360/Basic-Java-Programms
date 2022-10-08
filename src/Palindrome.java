import java.util.Scanner;

public class Palindrome {

    /**
     * Palindrome of  a Number program by Majid Manzoor Mir on 07/10/2022, 08:15pm
     **/

    /*** Palindrome is a number whose reverse is equal to the  number itself  */
    public static void main(String args[]) {

        int num;
        System.out.print("Enter No. to check whether it is Palindrome or Not\n");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int result = reverseNum(num);

        if (num == result) {

            System.out.print(num +"" +
                    "\tis palindrome");
        }else {
            System.out.print(num+"\tis Not Palindrome");
        }
    }

    private static int reverseNum(int num) {
        int last,reverse = 0;

        while (num>0){
            last = num%10;

            reverse = reverse * 10+ last;

            num = num/10;

        }
        return  reverse;
    }
}
