package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioAreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da base do triangulo: ");
        double base = entrada.nextDouble();

        System.out.print("Informe o valor da altura do triangulo: ");
        double altura = entrada.nextDouble();

        double resultado = base * altura / 2;

        System.out.println("O valor da area do triangulo é: " + resultado);

        entrada.close();
    }
}
