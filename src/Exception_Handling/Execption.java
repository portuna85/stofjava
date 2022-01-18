package Exception_Handling;

public class Execption {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                System.out.println(i + " : Try");
                System.out.println(i / 0 + " :  Error ");
                System.out.println(i + " : SHOW");
            }catch (ArithmeticException ae) {
                System.out.println(i + " : true");
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }

    }
}
