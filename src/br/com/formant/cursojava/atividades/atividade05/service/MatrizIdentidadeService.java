package br.com.formant.cursojava.atividades.atividade05.service;

import static br.com.formant.cursojava.atividades.atividade05.MatrizIdentidadeUtils.geraMatriz;

import java.util.Scanner;

public class MatrizIdentidadeService {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Digite um número para definir o tamanho desejado para sua matriz identidade: ");
        int tamanho= scan.nextInt();

        geraMatriz(tamanho);
    }
}
