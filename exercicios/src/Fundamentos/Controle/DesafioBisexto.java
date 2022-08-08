package Fundamentos.Controle;

import java.util.Scanner;

public class DesafioBisexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = entrada.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("Ano bisexto!");
                }
            }
        } else {
            System.out.println("Não é um ano bisexto");
        }

        entrada.close();
    }
}
