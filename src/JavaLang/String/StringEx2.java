package JavaLang.String;

public class StringEx2 {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "a";
        String str3 = "a";
        String str4 = new String("a");
        String str5 = new String("a");
        String str6 = new String("a");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println();
        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(str6));

    }
}
