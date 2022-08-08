package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        // metodo feito por mim
        double f = 86;
        double c = (f - 32) * 5.0/9.0;

        // metodo feito pelo professor
        final double fator = 5.0 / 9.0;
        final double ajuste = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - ajuste) * fator;

        // resultado iguais
        System.out.println(celsius);
        System.out.println(c);
    }
}
