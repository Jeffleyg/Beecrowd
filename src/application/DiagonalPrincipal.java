package application;

import java.util.Scanner;

public class DiagonalPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operacao = scanner.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        double resultado = calcularResultado(operacao, matriz);
        System.out.printf("%.1f\n", resultado);

        scanner.close();
    }

    public static double calcularResultado(char operacao, double[][] matriz) {
        double soma = 0;
        int elementosAcimaDiagonalPrincipal = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                soma += matriz[i][j];
                elementosAcimaDiagonalPrincipal++;
            }
        }

        if (operacao == 'M') {
            return soma / elementosAcimaDiagonalPrincipal;
        } else {
            return soma;
        }
    }
}
