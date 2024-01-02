package application;

import java.util.Scanner;
public class Mutiples {

	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A, B;
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        
        if(A%B == 0 || B % A == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

        scanner.close();
    }

}
