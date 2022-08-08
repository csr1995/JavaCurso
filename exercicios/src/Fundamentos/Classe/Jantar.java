package Fundamentos.Classe;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p = new Pessoa("João", 89.8);

        System.out.println(p.Apresentar());
        p.Comer(c1);
        System.out.println(p.Apresentar());
        p.Comer(c2);
        System.out.println(p.Apresentar());

    }
}
