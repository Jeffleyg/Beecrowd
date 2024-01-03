package application;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int funcionario, horas;
        float SalarioPorHoras, Salary;
        
        funcionario = scanner.nextInt();
        horas = scanner.nextInt();
        SalarioPorHoras = scanner.nextFloat();
        
        Salary = SalarioPorHoras * horas;
        
        scanner.close();
        
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f%n", Salary);
    }

}
