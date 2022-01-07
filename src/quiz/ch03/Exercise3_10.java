package quiz.ch03;

class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (ch >= 'a' || ch <= 'z') ? (char) (ch + 32) : ch;
        System.out.println("ch:" + ch);
        System.out.println("ch to lowerCase:" + lowerCase);
    }
}