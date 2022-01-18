package Exception_Handling;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method();
    }

    static void method() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외처리가 됨");
            e.printStackTrace();
        }
    }
}
