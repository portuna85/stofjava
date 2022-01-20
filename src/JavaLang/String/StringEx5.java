package JavaLang.String;

public class StringEx5 {
    public static void main(String[] args) {
        String animal = "dog, cat, bear";
        String[] arr = animal.split(", ");
        String str = String.join(" - ", arr);

        System.out.println(animal);
        System.out.println("arr[0] : " + arr[0]);
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[2] : " + arr[2]);

        System.out.println(str);
    }
}
