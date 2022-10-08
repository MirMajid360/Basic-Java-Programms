import java.util.Scanner;

public class PalindromeString {
    /**
     * Palindrome of  a String program by Majid Manzoor Mir on 08/10/2022, 08:15pm
     **/

    /*** Palindrome String is a string  whose reverse is same  as original  */

    public static void main(String args[]) {

        String string;
        System.out.print("Enter String  to check whether it is Palindrome or Not\n");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();

        String result = reverseString(string);

        if (string.equals(result)){
            System.out.print(string+"\tis Palindrome string ");
        }else {
            System.out.print(string+"\tis Not Palindrome");
        }


    }

    private static String reverseString(String str) {

        String rev ="";
        int length=str.length();
        for(int i=length-1; i>=0;i--){

            rev = rev+ str.charAt(i);
        }
        return rev;

    }

}
