package application;

import java.util.Scanner;

public class ValidateVetor {

	public static void main(String[] args) {
		    
		    Scanner Valida = new Scanner(System.in);
		    int notasValidas = 0;
		    double Soma = 0.0;
		    
		    while(notasValidas < 2){
		        double NotaDigitado = Valida.nextDouble();
		        
		        if(NotaDigitado < 0.0 || NotaDigitado > 10.0){
		            System.out.println("nota invalida");
		            
		        }else{
		            Soma += NotaDigitado;
		            notasValidas++;
		        }
		    }
		    
		    double media = Soma / 2.0;
		    System.out.printf("media = %.2f%n", media);
		    
		    Valida.close();
		}
}
