package application;

import java.util.Scanner;

public class BasicExtreme {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    int A, B, X;
	    
	    A = scanner.nextInt();
	    B = scanner.nextInt();
	    
	    X = A + B;
	    
	    scanner.close();
	    
		System.out.println("X = " + X);
	}

}
