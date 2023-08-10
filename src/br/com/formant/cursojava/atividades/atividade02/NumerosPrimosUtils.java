package br.com.formant.cursojava.atividades.atividade02;

public class NumerosPrimosUtils {

    public static boolean ePrimo(int numero) {
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor== 0)
                return false;
        }
        return true;
    }
}