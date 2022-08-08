package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;  // variavel
        final double pi = 3.14159;  // constante

        double area = pi * raio * raio;
        System.out.println("O valor da area é: " + area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println(area);
    }
}
