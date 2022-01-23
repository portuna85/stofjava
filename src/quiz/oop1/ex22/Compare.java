package quiz.oop1.ex22;

public class Compare {
    public static boolean isNumber(String str) {
        boolean ret = true;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' &&str.charAt(i)<='9'){
                continue;
            } else {
                ret = false;
                break;
            }
        }
        return ret;
    }
}