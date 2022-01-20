package JavaLang.String;

public class StringBuilderEx {
    public static void main(String[] args) {
        // StringBuffer는 동기화되어 있다. 멀티쓰레드에 안전(thread-safe)
        // StringBuffer는 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하
        //  이럴 땐 StringBuffer 대신 StrringBuilder을 사용하면 성능향상

        String str1 = "abc";
        String str2 = "EFG";
        String str3 = str1 + str2;
        System.out.println(str3);

        StringBuffer stringBuffer = new StringBuffer("abc");
        System.out.println(stringBuffer.append("EFG"));

        StringBuilder stringBuilder = new StringBuilder("abc");
        System.out.println(stringBuilder.append("EFG"));
    }
}