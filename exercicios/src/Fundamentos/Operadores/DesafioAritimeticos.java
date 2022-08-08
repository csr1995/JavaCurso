package Fundamentos.Operadores;

public class DesafioAritimeticos {
    public static void main(String[] args) {
        /*
        int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        double c = Math.pow(a, 3);

        System.out.println(b);
        System.out.println(c);
        */

        double a = Math.pow(6 * (3 + 2), 2);
        double b = (3 * 2);

        double c = (1 - 5) * (2 - 7);
        double d = 2;

        double e = a / b;
        double f = Math.pow(c / d, 2);

        double superior = Math.pow(e - f, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println(resultado);

    }
}
