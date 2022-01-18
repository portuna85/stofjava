package Exception_Handling;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int maxNum = 100;
        int result;
        int num;

        try {
            for (int i = 0; i < 10; i++) {
                num = (int) ((Math.random()) * 10);
                System.out.println(num);
                result = maxNum / num;
                System.out.println(result);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
