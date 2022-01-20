package CalendarDate;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Date date1 = new Date();
        cal1.set(2022, 11, 28);
        System.out.println(cal1.toInstant());
    }
}
