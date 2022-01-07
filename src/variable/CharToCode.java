package variable;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int) ch;
        System.out.printf("%d, (%#X), %c\n", code, code, ch);

        char hch = '가';
        System.out.printf("%c = %d(%#X)\n",hch, (int) hch, (int) hch);
    }
}
