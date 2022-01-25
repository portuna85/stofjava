package CollectsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx5 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        // ArrayList에는 객체만 저장가능
        // autoboxing에 의해 기본형이 참조형으로 자동변환
        list1.add(5);                               // list1.add(new Integer(5));  new Integer()  <- 생략
        list1.add(new Integer(4));
        list1.add(new Integer(1));
        list1.add(new Integer(0));
        list1.add(new Integer(2));
        list1.add(new Integer(3));

        // ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1, 4));       // sublist(1번이상 index, 4번미만 index)는 ArrayList의 일부를 뽑아 새로운 List 생성
        print(list1, list2);

        /*
        여긴 Collection이 아님 Collections - 이건 클래스
        Collections.sort를 사용하여 list1, list2 정렬
        */
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        // list1에 list2가 포함되어 있는지 확인 메소드
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        // list2에 index : 3 자리에 element : A 추가
        list2.add('B');
        list2.add('C');
        list2.add(3, 'A');
        print(list1, list2);

        // list2에 index : 3 자리에 elemlnt : AAA 로 set으로 변경
        list2.set(3, "AAA");
        print(list1, list2);

        // list1에 index : 0 자리에 element : String 타입의 "1" 추가
        list1.add(0, "1");

        // indexOf()는 지정된 객체의 위치(index)를 알려준다.
        System.out.println("index = " + list1.indexOf(new Integer("1")));
        print(list1, list2);

        // list1에 index : 1 자리의 객체 삭제  list1
        list1.remove(1);                        // 인덱스가 1인 객체 삭제  new Integer()의 사용유무 철처확인
        print(list1, list2);
        // list1에 new Integer(1) element 삭제
        list1.remove(new Integer(1));           // 1을 삭제 new Integer()의 사용유무 철처확인
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지 삭제.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        /*
        list2에서 list1에 포함된 객체들을 삭제
        1. get(i)로 list2에서 하나씩 꺼낸다.
        2. contains()로 꺼낸 객체가 list1에 있는지 확인
        3. remove(i)로 해당객체를 list2에서 삭제
        */

        /*
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list1.remove(i);
            }
        }
        */
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println("---------------------------------------------");
    }
}
