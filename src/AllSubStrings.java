import java.util.Scanner;

public class AllSubStrings {



    /**
     *Program to get all sub Strings of a String Majid Manzoor Mir on 09/10/2022
     **/


    public static void main(String args[]) {


        System.out.print("Enter String to get its All Sub Strings \n");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        subStrings(string);
    }
    public static void subStrings(String str)
    {
        System.out.println("All substring of"+str+ "are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));

            }
        }
    }
}
