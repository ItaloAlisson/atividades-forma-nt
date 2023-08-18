package br.com.formant.cursojava.atividades.semana01.atividade02.service;

import static br.com.formant.cursojava.atividades.semana01.atividade02.NumerosPrimosUtils.ePrimo;

public class NumerosPrimosService {

    public static void main(String[] args) {
        for (int numero = 2; numero <= 1000; numero++) {
            if (ePrimo(numero))
                System.out.println(numero);
        }
    }
}
