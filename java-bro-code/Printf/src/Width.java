// 10. printf

public class Width {
    public static void main(String[] args) {

        // width

        int id1 = 1;
        int id2 = 53;
        int id3 = -439;
        int id4 = 6455;

        System.out.printf("%04d\n", id1);       // coloca zeros antes do numero
        System.out.printf("%4d\n", id2);        // justifica para direita
        System.out.printf("%-4d\n", id3);       // justifica para esquerda
        System.out.printf("%04d\n", id4);

    }
}
