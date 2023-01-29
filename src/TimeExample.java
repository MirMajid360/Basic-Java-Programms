import java.util.Scanner;

public class TimeExample {

    public static void main(String args[]) {


        String date = Time.Companion.getDateInString();
        String time = Time.Companion.getTimeInString();


        System.out.println(time);
        System.out.println(date);
    }

}
