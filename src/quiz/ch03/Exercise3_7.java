package quiz.ch03;


class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ((int) ((float) 5 / 9 * (fahrenheit - 32) * 1000) / 1000);
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);
    }
}
