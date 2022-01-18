package Exception_Handling;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("고의 발생");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}