import java.util.Scanner;

public class DuplicateCharacterFromStrong {

    /** Finding the Duplicate Character from String Programme by Majid Manzoor Mir on 08/10/2022**/

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String \n");
        String string = sc.nextLine();
        findDuplicate(string);
    }

    private static void findDuplicate(String string) {

        String temp = string;
        int counter;
        Character ch;
        for(int i=0;i<string.length();i++){

            counter = 1;
            ch = string.charAt(i);
            for(int j=i+1;j<temp.length();j++){

                if (ch==string.charAt(j) && string.charAt(i)!=' '
                ){
                    counter++;



                }
            }
            if (counter>1){
                System.out.print(string.charAt(i)+"\tappears\t"+counter+"times\n");
            }

        }



    }
}
