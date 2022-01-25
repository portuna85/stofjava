/*
package Generics.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

public class AnnotationEx1 {
    public static void main(String[] args) {
        Child child = new Child();
        Date date = new Date();
        System.out.println(date.getDate());

        System.out.println(child.parentMethod());
    }
}

class Parent {
    @Deprecated
    public boolean parentMethod() {
        System.out.println("ddd");
        return false;
    }

    public void method() {}
}

class Child extends Parent {
    @Override
    public boolean parentMethod() {
        return true;
    }
}*/
