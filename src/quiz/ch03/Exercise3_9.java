package quiz.ch03;

class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
        System.out.println(b);
    }
}