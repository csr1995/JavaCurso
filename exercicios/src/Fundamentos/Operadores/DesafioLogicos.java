package Fundamentos.Operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho a terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean naoComprouTv = !trabalho1 || !trabalho2;

        if(comprouTv50) {
            System.out.println("Os dois trabalhos deram certo. Então comprarei a TV de 50 polegadas e tomaremos sorvete!");
        }

        else if(comprouTv32) {
            System.out.println("Somente um trabalho deu certo. Então comprarei a TV de 32 polegadas e tomaremos sorvete!");
        }

        else if(naoComprouTv) {
            System.out.println("Nenhum trabalho de certo. Não comprarei nenhuma TV e não tomaremos sorvete!");
        }
    }
}
