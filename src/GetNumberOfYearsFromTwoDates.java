import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.LocalDate.parse;

public class GetNumberOfYearsFromTwoDates {

    /**Programme to get the No of Years ,Months, Days from two Different Dates by Majid Manzoor Mir**/

    public static void main(String args[]) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(Locale.US);


        LocalDate startDate = parse("01/09/1995",f);
        LocalDate endDate = parse("30/11/2018",f);


        Period period = Period.between(startDate, endDate);
        System.out.print("Start date\t"+startDate+"End Date\t"+endDate);

        System.out.print("\nYears\t"+period.getYears());
        System.out.print("\nMonths\t"+period.getMonths());
        System.out.print("\nDays\t"+period.getDays());

    }


}
