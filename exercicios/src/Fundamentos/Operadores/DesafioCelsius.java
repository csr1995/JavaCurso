package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double temperatura = entrada.nextDouble();

        double fahrenheit = temperatura * 1.8 + 32;

        System.out.println("A temperatura em Farenheit é: " + fahrenheit);

        entrada.close();
    }
}
