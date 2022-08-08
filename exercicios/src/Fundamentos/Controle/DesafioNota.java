package Fundamentos.Controle;

import java.util.Scanner;

public class DesafioNota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Infome a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 || media >= 4) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        System.out.println(media);
        entrada.close();
    }
}
