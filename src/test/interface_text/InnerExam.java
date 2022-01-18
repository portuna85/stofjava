package test.interface_text;

public class InnerExam {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.new Inner(){
            @Override
            public void valuePrint() {
            }
        };

    }
}

class Outer1 {
    public int value = 10;

    class Inner {
        public int value = 20;

        public void valuePrint() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("outer.this.value : " + Outer1.this.value);
        }
    }
}