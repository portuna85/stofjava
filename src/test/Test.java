package test;

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
    }
}

class Parent {
    public String parentName;
    public int parentAge;
    public void run(){
        System.out.println(parentName);
        System.out.println(parentAge);
    }
}

class Child {
    Parent p = new Parent() {
        public String childName;
        public int childAge;

        @Override
        public void run() {
            System.out.println(childName);
            System.out.println(childAge);
        }
    };
}