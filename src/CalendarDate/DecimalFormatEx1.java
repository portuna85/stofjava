package CalendarDate;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("####.#E0###");

        double num = 123456789.987654321;
        String result = dec.format(num);

        System.out.println(result);


    }
}
