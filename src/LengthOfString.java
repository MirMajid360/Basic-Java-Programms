import java.util.Scanner;

public class LengthOfString {

    /**
     * Program to get the Length of String without using the .length method by Majid Manzoor Mir on 08/10/2022
     **/


    public static void main(String args[]) {

        System.out.print("Enter String \n");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int result = lengthOfString(string);

        System.out.print("Length  of Entered String is\t " + result);
    }



    public static int lengthOfString(String str) {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;

    }
}