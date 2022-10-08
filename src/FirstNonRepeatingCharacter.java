import java.util.Scanner;

public class FirstNonRepeatingCharacter {


    /**
     * Programme to get the First Non repeating Character from string by Majid Manzoor Mir on 08/10/2022
     **/


    public static void main(String args[]) {

        System.out.print("Enter String to get it First Non Repeating Character\n");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char res = firstNonRepeatingChar(string);

        if (res == ' ') {
            System.out.print("No Non Repeating Character Found ");
        } else {
            System.out.print("First Non Repeating Character is \t" + res);

        }

    }

    private static char firstNonRepeatingChar(String str) {

        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(charArray[i]) == str.lastIndexOf(charArray[i])) {
                return charArray[i];
            }
        }
        return ' ';

    }
}
