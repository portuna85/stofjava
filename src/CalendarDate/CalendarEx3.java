package CalendarDate;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {10, 10, 1};
        final String[] TIME_UNIT_NAME = {"시", "분", "초"};

        Date date = new Date();
        Calendar cal1 = Calendar.getInstance();
        date.setTime(cal1.getTimeInMillis());
        System.out.println(cal1.toInstant());

        cal1.clear();
        System.out.println(cal1.toInstant());
        System.out.println(date.getMonth() + 1);
    }
}
