package br.com.formant.cursojava.atividades.semana02.atividade01;

public class FatorialUtils {

    public static int geraFatorial(int fatorial) {
        if (fatorial == 0 || fatorial == 1) {
            return 1;
        }
        int resultado = fatorial * (fatorial - 1);
        for (int antecessor = fatorial - 2; antecessor > 0; antecessor--) {
            resultado = resultado * antecessor;
        }
        return resultado;
    }

}
