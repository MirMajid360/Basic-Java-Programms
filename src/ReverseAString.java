import java.util.Scanner;

public class ReverseAString {

    /**
     * Reverse a Number program by Majid Manzoor Mir on 07/10/2022, 80;30am
     **/



    public static void main(String args[]) {

        System.out.print("Enter String to get it reverse\n");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String result = reverseString(string);

        System.out.print("Reverse of String \t"+ string +"is "+ result);
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
