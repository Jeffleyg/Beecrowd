package application;

import java.util.Scanner;

public class SubstititioVetor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorX = new int[10];

        for (int i = 0; i < 10; i++) {
            vetorX[i] = sc.nextInt();
            if (vetorX[i] <= 0) {
                vetorX[i] = 1;
            }
            System.out.printf("X[%d] = %d%n", i, vetorX[i]);
        }

        sc.close();
    }

}
