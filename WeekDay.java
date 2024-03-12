package anudipjava;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class WeekDay
{
    public static void main(String[] args)
    {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // Get the localized name of the day of the week
        String dayOfWeekName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        // Display the day of the week
        System.out.println("Today is " + dayOfWeekName);
    }
}
