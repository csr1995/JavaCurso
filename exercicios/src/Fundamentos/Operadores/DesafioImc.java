package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Informe a sua altura: ");
        String altura = entrada.next().replace(",", ".");
        double alturaFinal = Double.parseDouble(altura);

        double resultado = peso / Math.pow(alturaFinal, 2);

        System.out.println(resultado);

        entrada.close();
    }
}
