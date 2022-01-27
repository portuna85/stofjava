package Lamda_Steam.Lambda.LambdaInner;

public class UsingThisEx {
    public static void main(String[] args) {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();


        inner.method();

    }
}
