            // 11. compound interest

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double montanteFinal;
        double capitalInicial;
        double taxaJuros;
        int tempo;

        System.out.print("digite o capital inicial: ");
        capitalInicial = scanner.nextDouble();

        System.out.print("digite a taxa de juros em %: ");
        taxaJuros = scanner.nextDouble() / 100;

        System.out.print("numero de meses da aplicacao: ");
        tempo = scanner.nextInt();

        montanteFinal = capitalInicial * Math.pow(1 + taxaJuros, tempo);

        System.out.printf("o montante final sera de R$%.2f", montanteFinal);


        scanner.close();

    }
}
