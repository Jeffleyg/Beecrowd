package application;

import java.util.Scanner;

public class cedulas {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        scanner.close();

        System.out.println(valor);

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        for (int cedula : cedulas) {
            int quantidadeNotas = valor / cedula;
            System.out.printf("%d nota(s) de R$ %d,00%n", quantidadeNotas, cedula);
            valor %= cedula;
        }
    }

}
