package CollectsFramework.List.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue que = new LinkedList();           // Queue 인터페이스의 구현체인 ListList

        st.push("1");
        st.push("2");
        st.push("3");

        que.offer("1");
        que.offer("2");
        que.offer("3");

        System.out.println("= Stack =");
        while (!st.empty()) {                      // 스택에서 비었는지 확인
            System.out.println(st.pop());         // 스택에서 요소를 하나씩 꺼낸다.  출력 3, 2, 1
        }

        System.out.println("= Queue =");
        while (!que.isEmpty()) {                    // 큐에서 비었는지 확인
            System.out.println(que.poll());       // 큐에서 요소를 하나씩 꺼낸다.    출력 1, 2, 3
        }
    }
}
