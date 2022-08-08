package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioQuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        double num1 = entrada.nextDouble();

        double resultadoQuadrado = Math.pow(num1, 2);
        System.out.print("\nO valor ao quadrado é: " + resultadoQuadrado);

        double resultadoCubo = Math.pow(num1, 3);
        System.out.print("\nO valor ao cubo é: " + resultadoCubo);

        entrada.close();
    }
}
