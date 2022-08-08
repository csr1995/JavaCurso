package Fundamentos.Classe;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void Comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String Apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
