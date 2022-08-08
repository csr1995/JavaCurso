package Fundamentos.Controle;

import java.util.Scanner;

public class DesafioNumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = entrada.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Não é um numero primo!");
            }
        }
        System.out.println("É primo");
        entrada.close();
    }
}
