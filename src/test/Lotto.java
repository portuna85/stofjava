package test;

import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        ArrayList lotto = new ArrayList();
        int num;

        for (int i = 0; i < 6; i++) {
            num = (int)(Math.random() * 45 + 1);
            lotto.add(num);
        }


        Collections.sort(lotto);
        System.out.println(lotto);

    }
}