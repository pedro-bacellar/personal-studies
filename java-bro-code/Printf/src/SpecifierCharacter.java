// 10. printf

public class SpecifierCharacter {
    public static void main(String[] args) {

        // specifier character

        String name = "Pedro";
        char firstLetter = 'P';
        int age = 21;
        double height = 1.74;
        boolean isEmployed = false;

        System.out.printf("hello %s\n", name);                      // %s for string
        System.out.printf("the first letter of your name is: %c\n", firstLetter);       // %c for char
        System.out.printf("you are %d years old\n", age);           // %d for int
        System.out.printf("you are %.2fcm tall\n", height);         // %f for double or float
        System.out.printf("employed: %b\n\n", isEmployed);          // %b for boolean

    }
}