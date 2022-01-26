package quiz.ch11.ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

class Exercise11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();      // 순서 ok 중복 ok
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        // 3 6 2 2 2 7
        HashSet set = new HashSet(list);      // 순서 x 중복 x 3 6 2 7
        TreeSet tset = new TreeSet(set);      // 7 6 3 2
        Stack stack = new Stack();
        stack.addAll(tset);

        while (!stack.empty())
            System.out.println(stack.pop());
    }
}