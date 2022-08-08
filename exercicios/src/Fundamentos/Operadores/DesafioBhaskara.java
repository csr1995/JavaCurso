package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioBhaskara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o elemento 'a': ");
        double a = entrada.nextDouble();

        System.out.print("Informe o elemento 'b': ");
        double b = entrada.nextDouble();

        System.out.print("Informe o elemento 'c': ");
        double c = entrada.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println(delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println(x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(x2);

        entrada.close();

    }
}
