package CalendarDate;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "MON", "TUE", "WEN", "THUR", "FRI", "TES", "SUN"};
        Calendar instance = Calendar.getInstance();

        System.out.println(DAY_OF_WEEK[instance.get(Calendar.DAY_OF_WEEK)]);
    }
}
