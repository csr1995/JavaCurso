package Fundamentos.Classe;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data(); // retorno do construtor vazio criado na classe data

        //data.dia = 19;
        //data.mes = 04;
        //data.ano = 1995;

        Data data1 = new Data(31, 12, 2020); // retorno do construtor com 3 paramestro criado na classe data

        System.out.printf(data.obterDataFormatada());
        System.out.printf(data1.obterDataFormatada());
    }
}
