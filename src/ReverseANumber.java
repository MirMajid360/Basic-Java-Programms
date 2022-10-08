import java.util.Scanner;

public class ReverseANumber {
    /**
     * Reverse a Number program by Majid Manzoor Mir on 07/10/2022, 80;30am
     **/



    public static void main(String args[]) {

        int num;
        System.out.print("Enter No. to get it reverse\n");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int result = reverseNum(num);

        System.out.print("Reverse of number \t"+ num +"is "+ result);
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
