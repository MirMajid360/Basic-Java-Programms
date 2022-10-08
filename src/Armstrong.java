import java.util.Scanner;

public class Armstrong {
    /**
     * Armstrong  by Majid Manzoor Mir on 07/10/2022, 08:40am
     **/

    /** Armstrong is a number whose sum of cubes of each digit is equal to the number
     * Example 153 = 1*1*1+5*5*5+3*3*3 **/

    public static void main(String args[]) {

        int num;
        System.out.print("Enter No. to check whether it is Armstrong or not\n");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

       int result = armstrong(num);

       if (result==num){
           System.out.print(num +"is Armstrong");
       }
       else {
           System.out.print(num+"is Not Armstrong");
       }
    }

    private static int armstrong(int num) {
        int last,sumOfCubes =0;

        while(num>0){
            last = num%10;
            num = num/10;

            sumOfCubes = sumOfCubes +(last*last*last);
        }
        return sumOfCubes;


    }
}
