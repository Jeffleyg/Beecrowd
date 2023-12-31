package application;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            int posicao = vetor[i];
            vetor[i] = vetor[19 - i];
            vetor[19 - i] = posicao;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }

        sc.close();
    }

}
