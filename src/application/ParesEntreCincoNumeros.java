package application;

import java.util.Scanner;

public class ParesEntreCincoNumeros {

	public static void main(String[] args){
        Scanner teste = new Scanner(System.in); //scanner 

        int NumeroPares = 0;
        //float Soma = 0;

        for(int i = 0; i < 5; i++){
           int valorDigitado = teste.nextInt();

            if(valorDigitado % 2 == 0){
                NumeroPares++;

            }
        }
        
        System.out.println(NumeroPares + " valores pares");
        teste.close();
    }

}
