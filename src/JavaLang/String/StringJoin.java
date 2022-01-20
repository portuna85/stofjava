package JavaLang.String;

public class StringJoin {
    public static void main(String[] args) {
        String str1 = "Hello, Bye, Good Morning";
        String[] strArr = {"Hello, JAVA", "Bye, JAVA", "Good, JAVA"};
        String[] str2 = str1.split(", ");

        for (int i = 0; i < str2.length; i++) {
            System.out.print(i + " " + str2[i]);
        }
        System.out.println();

        System.out.println(String.join(" - ", str1));
        System.out.println(String.join(" - ", strArr));


    }
}
