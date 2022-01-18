package Exception_Handling;

public class ExceptionEx7 {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 1; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            try {
                System.out.println("random = " + random);
                System.out.println();
                System.out.println("num/random = " + num / random);
            } catch (ArithmeticException ae) {
                if (ae instanceof ArithmeticException) {
                    System.out.println("true");
                }
                System.out.println("ArithmeticException");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}