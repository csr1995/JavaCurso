package Fundamentos.Arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            totalA += notasAlunoA[i];
        }

        System.out.println(totalA / notasAlunoA.length);

        double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

        double totalB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalB += notasAlunoB[i];
        }

        System.out.println(totalB / notasAlunoB.length);
    }
}
