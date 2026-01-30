            // 66. generics

public class Main {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>();

        box.setItem(123);

        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.5);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
