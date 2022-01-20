package CalendarDate;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = new Date(2022);
        System.out.println(date.getTime());

        System.out.println(cal.getActualMaximum(Calendar.DATE));
        System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println();
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.ZONE_OFFSET));
        System.out.println(cal.get(Calendar.AM_PM));

        System.out.println(cal.get(Calendar.MONTH));
    }
}
