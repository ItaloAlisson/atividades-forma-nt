package br.com.formant.cursojava.atividades.atividade04.test;

import br.com.formant.cursojava.atividades.atividade04.classes.Motorista;

public class AtividadeTest {

    public static void main(String[] args) {
        Motorista rodrigo = new Motorista();
        rodrigo.setNome("Rodrigo");
        rodrigo.setCargo("Motorista");
        rodrigo.setPlacaCarro("LSN4149");

        Motorista andre = new Motorista();
        andre.setNome("André");
        andre.setCargo("Motorista");
        andre.setPlacaCarro("OTM2036");

        rodrigo.imprime();
        System.out.println("----------------------");
        andre.imprime();
    }
}
