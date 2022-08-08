package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperatura = entrada.nextDouble();

        double celsius = (temperatura - 32) / 1.8;

        System.out.println("A temperatura em Celsius é: " + celsius);

        entrada.close();

    }
}
