package Exception_Handling;

public class Exeception12 {
    public static void main(String[] args) throws Exception {
        method();
    }

    static void method() throws Exception {
        method(124);
    }

    static void method(int i) throws Exception {
        System.out.println(i);
        throw new Exception();
    }
}


