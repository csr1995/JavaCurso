package Fundamentos.Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7) {
            System.out.println("Aprovado!");
        }

        if (media < 7 && media >= 5) {
            System.out.println("Recuperação!");
        }

        boolean criterioAprovacao = media < 5 && media >= 0;
        if (criterioAprovacao) {
            System.out.println("Reprovado!");
        }

        entrada.close();

    }
}
