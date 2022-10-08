import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    /**
     * Program to check if two given strings are anagrams by Majid Manzoor Mir on 08/10/2022, 09:15am
     **/

    /*** An anagram is of the same length and is composed of the same characters, but in a different order.  */

    public static void main(String args[]) {

        String firstString,secondString;
        System.out.print("Enter First string \n");
        Scanner scanner = new Scanner(System.in);
        firstString = scanner.nextLine();
        System.out.print("Enter Second string\n");
        secondString = scanner.nextLine();


      checkAnagrams(firstString,secondString);

    }

    private static void checkAnagrams(String a, String b) {

        if (a.length() != b.length()){
            System.out.print("Strings of different length can not be Anagrams");
        }else {

            // convert strings to char array
            char[] charArrayFirst = a.toCharArray();
            char[] charArraySecond = b.toCharArray();

            // sort the char array
            Arrays.sort(charArrayFirst);
            Arrays.sort(charArraySecond);

            if (Arrays.equals(charArrayFirst, charArraySecond)){
                System.out.print("Entered Strings are Anagrams");
            }else{
                System.out.print("Entered Strings are not Anagrams");
            }
        }
    }

}
