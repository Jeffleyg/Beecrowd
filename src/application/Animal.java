package application;

import java.util.Scanner;
public class Animal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();

// usando '.equals' para ver se as palavras são iguais.
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
        scanner.close(); // fechamento
    }

}
