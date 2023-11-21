import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDisplays {
    public static void main( String[] args){

        LocalDate localDate = LocalDate.now();
       displayCalendar(localDate);

    }

    public static void displayCalendar(LocalDate localDate){
        LocalDate firstDayOfMonth = localDate.withDayOfMonth(1);

        int lengthOfMonth = localDate.lengthOfMonth();

        System.out.println(localDate.getMonth() + " " + localDate.getYear());

        // Display the days of the week
        System.out.println("Mon  Tue  Wed  Thu  Fri  Sat Sun");

        // Determine the day of the week for the first day of the month
        int dayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();
        // Print leading spaces to align the first day of the month
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= lengthOfMonth; day++) {
            if (day == localDate.getDayOfMonth()) {
                // Mark the current day with an asterisk
                System.out.printf("[%2d]* ", day);
            } else {
                System.out.printf("%3d  ", day);
            }

            if ((day + dayOfWeek - 1) % 7 == 0 || day == lengthOfMonth) {
                System.out.println();
            }


       }



}
}
