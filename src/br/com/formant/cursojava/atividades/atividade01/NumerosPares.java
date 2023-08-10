package br.com.formant.cursojava.atividades.atividade01;

public class NumerosPares {

    public static void main(String[] args) {
        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
