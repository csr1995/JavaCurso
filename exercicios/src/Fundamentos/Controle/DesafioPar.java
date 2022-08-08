package Fundamentos.Controle;

import java.util.Scanner;

public class DesafioPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 10: ");
        int i = entrada.nextInt();

        if (i >= 0 || i <= 10) {
           if (i % 2 == 0) {
               System.out.println("O numero indicado é par!");
           } else {
               System.out.println("O numero indicado é impar");
           }
        }
        entrada.close();
    }
}
