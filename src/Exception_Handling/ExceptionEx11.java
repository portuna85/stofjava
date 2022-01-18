package Exception_Handling;

public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException();       // unchecked 예외 - 선택
        // throw new Exception();           // checked 예외 - 필수
    }
}