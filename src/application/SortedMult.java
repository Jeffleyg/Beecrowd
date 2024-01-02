package application;

import java.util.Scanner;

public class SortedMult {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        
        int menor, maior, meio;
        
        menor = Math.min(Math.min(A, B), C);
        maior = Math.max(Math.max(A, B), C);
        meio = A + B + C - menor - maior;
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        scanner.close();
	}
        
}
