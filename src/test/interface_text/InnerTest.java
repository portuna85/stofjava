package test.interface_text;

public class InnerTest {
    public class InstanceInner {
        public int iv = 100;
        protected int cv = 100;
        private final static int CONST = 100;
    }

    static class StaticInner {
        public int iv = 200;
        public static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            public int iv = 300;
            protected int cv = 300;
            public final static int CONST = 300;
        }
        System.out.println(LocalInner.CONST);
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        InnerTest in = new InnerTest();

    }
}