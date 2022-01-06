package variable;

public class CharAtCode {
    public static void main(String[] args) {
        char ch = 'T';
        int code = (int) ch;
        System.out.printf("%d, (%#X), %c", code, code, ch);
    }
}
