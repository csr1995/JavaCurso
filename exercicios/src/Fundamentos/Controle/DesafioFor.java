package Fundamentos.Controle;

public class DesafioFor {
    public static void main(String[] args) {

        for(String valor = "#"; !valor.equals("######") ; valor += "#") {
            System.out.println(valor);
        }

        /*for(int i = 1; i <= 5; i ++) {
            System.out.println(valor);
            valor += "#";
        }*/

        // Versão do desafio
        // Não pode usar valor numerico pra controlar o laço!
    }
}
