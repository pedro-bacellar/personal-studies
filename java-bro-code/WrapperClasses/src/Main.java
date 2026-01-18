            // 55. wrapper classes

public class Main {
    public static void main(String[] args){

//          autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

//          unboxing
        int x = a;

//            toString
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);

//            analysis
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

//            various methods
        char letter = 'b';

        System.out.println(Character.isLetter(letter));     // true
        System.out.println(Character.isUpperCase(letter));  // false






    }
}
