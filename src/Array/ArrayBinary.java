package Array;

import java.util.Arrays;

public class ArrayBinary {
    public static void main(String[] args) {
        char[] chHex = {'C', 'A', 'F', 'E'};
        String[] binary = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        String str = "";

        for (int i = 0; i < chHex.length; i++) {
            if (chHex[i] >= '0' && chHex[i] <= '9') {
                str += binary[chHex[i] - '0'];
            } else {
                str += binary[chHex[i] - 'A' + 10];
            }
        }

        System.out.println(new String(chHex));
        System.out.println(str);
    }
}
