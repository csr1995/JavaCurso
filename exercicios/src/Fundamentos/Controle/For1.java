package Fundamentos.Controle;

public class For1 {
    public static void main(String[] args) {
        /*int contador = 0;

        while(contador <= 20) {
            System.out.printf("i = %d\n", contador);
            contador += 2;
        }*/  // MESMA COISA ABAIXO

        for(int contador = 0; contador <= 20; contador += 2) {
            System.out.printf("i = %d\n", contador);
        }
    }
}
